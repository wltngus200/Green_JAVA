package com.green.day23;

import com.green.day22.MyConnection;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuyDao {
    private MyConnection myConn;

    BuyDao() {
        myConn = new MyConnection();
    }

    public int insBuy(BuyEntity entity) {
        String sql = "INSERT INTO buy" +//num은 자동 부여//num은 시도횟수기 때문에 차례대로가 아닐 수도 있다.
                "(mem_id, prod_name, group_name, price, amount)" +
                " VALUES (?, ?, ?, ?, ?)";
        System.out.println(sql);

        Statement stat = null;//쿼리를 실제로 실행하게 해주는 것
        int result = 0;//영향받은 행, 실제로 동작을 했는지를 확인
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());//1번 물음표에 값 넣기
            ps.setString(2, entity.getProdName());//String은 자동으로 ''들어감
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            System.out.println(ps);//쿼리문 보기
            return ps.executeUpdate();//try안에서 쿼리문에 정보를 담음 쿼리문을 실행하라는 명령어
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updBuy(BuyEntity entity) {//num값으로 다시 만들기!
        //num값은 절대 수정하면 안 됨!!
        String sql = String.format("UPDATE buy SET prod_name='%s', group_name='%s', price=%d, amount=%d" +
                        " WHERE mem_id='%s'",
                //mem_id=?, prod_name=?, group_name=?, price=?, amount=? WHERE num=? 아래 예외문
                //getNum을 하지 않아 모든 열이 바뀜!
                //String.format()은 값을 점검X 보안적인 면에서 별로 <-> ps.
                entity.getProdName(), entity.getGroupName(), entity.getPrice(), entity.getAmount(), entity.getMemId());
        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);

            //entity.setNum(n)
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }
        return result;
    }

    //pk값만 받아 지워질 수 있도록
    public int delBuy(int num) {
        String sql = "DELETE FROM buy WHERE num=?";
        System.out.println(sql);
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<BuySelVO> selBuyGroupByMemId() {
        String sql = "SELECT mem_id,COUNT(mem_id) AS buy_count FROM buy GROUP BY mem_id";//count(mem_id)구매 이력이 n번
        List<BuySelVO> list=new ArrayList<>();
        System.out.println(sql);
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
             while(rs.next()){//rs.next()가 true인 동안=다음 줄이 없으면 false
                 BuySelVO buySelVO=new BuySelVO(rs.getString("mem_id"),rs.getInt("buy_count"));
                 list.add(buySelVO);
             }
        }catch(Exception e){
            e.printStackTrace();
        }return list;
    }
}



class BuyDaoTest{
    public static void main(String[] args){
        BuyDao buyDao=new BuyDao();//My Connection 객체주소값 담기
        BuyEntity entity = new BuyEntity();
        entity.setMemId("RED");//멤버중에 없는 걸 하면 에러!
        entity.setProdName("구두");
        entity.setGroupName("패션");
        entity.setPrice(300);
        entity.setAmount(3);

        int affectedRow=buyDao.insBuy(entity);
        System.out.printf("affectedRow: %d\n",affectedRow);
    }
}
class updBuyTest{
    public static void main(String[] args){
    BuyDao dao=new BuyDao();
    BuyEntity buy=new BuyEntity();
    buy.setMemId("MMU");
    buy.setProdName("애플워치");
    buy.setGroupName("디지털");
    buy.setPrice(250);
    buy.setAmount(2);

    int affectdRow=dao.updBuy(buy);
    System.out.printf("affectedRow: %d\n", affectdRow);
    }
}
class BuyDelDaoTest{
    public static void main(String[] args){
        BuyDao buydao=new BuyDao();

        int affectdRow=buydao.delBuy(18);
        System.out.printf("affectedRow: %d\n", affectdRow);
    }
}
class BuySelDaoTest{
    public static void main(String[] args){
        BuyDao buydao=new BuyDao();

        System.out.println(buydao.selBuyGroupByMemId());
    }
}
