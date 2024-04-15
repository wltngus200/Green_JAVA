package com.green.day22;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//member 테이블 용 Data Access Object
public class MemberDAO {
    private MyConnection myConn;

    MemberDAO() {
        myConn = new MyConnection();
    }

    public int insMember(MemberEntity entity) {//추가
        String sql = String.format("INSERT INTO member" +
                        "(mem_id, mem_name, mem_number, addr,phone1,phone2, height, debut_date)" +
                        "VALUES" +
                        "('%s','%s','%d','%s','%s','%s','%d','%s')"
                , entity.getMemId(), entity.getMemName(), entity.getMemNumber(), entity.getAddr()
                , entity.getPhone1(), entity.getPhone2(), entity.getHeight(), entity.getDebutDate()
        );

        System.out.println(sql);
        Connection conn = null;//데이터베이스까지 가는 버스
        Statement stat = null;//쿼리를 실제로 실행하게 해주는 것
        int result = 0;//영향받은 행, 실제로 동작을 했는지를 확인
        try {//데이터베이스에 보내면 이런 식이다. 외울필요는 없다
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }
        return result;
    }
    public List<MemberEntity> selMemberList(){//읽어오기, 파라미터X=외부로부터 값X=부분으로 가져오지 않겠다
        List<MemberEntity> list =new ArrayList();
        //아이디 이름 데뷔날짜(내림차순)
        String sql=String.format("SELECT mem_id, mem_name, debut_date FROM member"+"ORDER BY debut_date DESC");


        System.out.println(sql);
        Connection conn = null;//연결담당
        Statement stat = null;//커넥션이 만들어냄, 쿼리문을 만들어낸다
        ResultSet rs= null;//대략의 데이터를 모두 수용//이상태로는 처리하기 힘들어 바꿀 것
        try {
            conn=myConn.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally{
            myConn.close(rs,stat,conn);
        }

        /*try{
            Connection conn= myConn.getConn();
            Statement stat= conn.createStatement();
            ResultSet rs=stat.executeQuery(sql);


                    MemberEntity member=new MemberEntity();
                    list.add(member);
                    member.setMemId(memId);
                    member.setMemName(memName);
                    member.setDebutDate(debutDate);
                }*/
        return list;

    }

    int updMember(MemberEntity entity) {//변경
        String mid = "";//아무것도 없는 빈 문자열//여기에 쿼리문을 추가해간다
        //entity 객체가 주는 값이 몇개일지 어떤 순서일지는 아무도 모른다! 들어오는 값에 따라 mid에 추가
        //어떤 순서로 올 지 알 수 없기 때문에 ,를 넣는다.
        if (entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name = '%s' ", entity.getMemName());
        }
        if (entity.getMemNumber() > 0) {
            mid += String.format(", mem_number = %d ", entity.getMemNumber());
        }
        if (entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", addr = '%s' ", entity.getAddr());
        }
        if (entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += String.format(", phone1 = '%s' ", entity.getPhone1());
        }
        if (entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2 = '%s' ", entity.getPhone2());
        }
        if (entity.getHeight() > 0) {
            mid += String.format(", height = %d ", entity.getHeight());
        }
        mid = mid.substring(1);//완성된 문장에서 첫 콤마를 떼어버린다.
        System.out.println(mid);

        String sql = String.format("UPDATE member SET %s WHERE mem_id = '%s'", mid, entity.getMemId());

        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;//영향 받은 행의 수 이걸 보고 실행이 되었는지 아닌지 확인 할 수 있다.
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }

        return result;
    }

    public int delMemberEntity(MemberEntity entity) {//삭제
        String sql = String.format("DELETE FROM member WHERE mem_id='%s'",entity.getMemId());//string이라서 홑따옴표

        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }
        return result;
    }
}
class SelListMemberTest{
    public static void main(String[] args){
        MemberDAO dao=new MemberDAO();
        List<MemberEntity> list = dao.selMemberList();
        //System.out.println(list);
        for(MemberEntity member: list){
            System.out.println(member);
        }
    }
}

class SubStringTest {
    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(str.substring(3));
        System.out.println(str.substring(4, 7));
        System.out.println(str);


        String str2 = ", 안녕, 하하, 좋아요";
        System.out.println(str2.startsWith(","));
        String str3 = str2.substring(2);
        System.out.println("str3: " + str3);
    }
}
class MemberDaoUpdateTest {
    public static void main(String[] args) {
        MemberDAO memberDao = new MemberDAO();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemNumber(6);
        member.setAddr("전주");
        member.setPhone1("011");

        int affectdRow = memberDao.updMember(member);
        System.out.printf("affectedRow: %d\n", affectdRow);
    }
}
class MemberDAODeleteTest{
    public static void main(String[] args){
        MemberDAO dao = new MemberDAO();

        MemberEntity member=new MemberEntity();
        member.setMemId("NJS");

        int affectdRow=dao.delMemberEntity(member);
        System.out.printf("affectedRow: %d\n", affectdRow);

    }
}

class MemberDAOTest{
    public static void main(String[] args){

        MemberDAO memberDAO = new MemberDAO();

        MemberEntity member=new MemberEntity();
        member.setMemId("NJS");
        member.setMemName("뉴진스");
        member.setMemNumber(4);
        member.setAddr("대구");
        member.setPhone1("053");
        member.setPhone2("77777777");
        member.setHeight(166);
        member.setDebutDate("2022-10-01");

        int affectedRow=memberDAO.insMember(member);
        System.out.printf("affectedRow: %d\n",affectedRow);

        //insMember 메소드 호출
        //1. 메소드가 어디에 있는지 확인 > MemberDAO에 있는 것을 확인함
        //2. static 메소드인지 아닌지 확인. 왜? 호출방법이 달라진다. > static 메소드가 아니기 때문에 MemberDao를 객체화 해야 한다.
        //3. 선언부를 확인하니 리턴타입은 int, 파라미터는 MemberEntity 객체 주소값 필요한 것을 확인
        //4. MeberDao객체 주소값 도트연산자를 이용하여 메소드 선언부에 맞추어 호출을 한다.
    }
}
