package com.green.day22;

import java.sql.*;
//싱글톤 SingleTon
public class MyConnection {//연결을 담당하는 커넥션 객체
    private final String DRIVER="org.mariadb.jdbc.Driver";
    private final String HOST="localhost";//다른 컴퓨터면 ip주소로
    private final String PORT="3306";//기본포트면 생략가능
    private final String DB_NAME="market_db";//어디에 접근을 할 것인가
    private final String USERNAME="root";
    private final String PASSWORD="green502";

    public Connection getConn() throws SQLException, ClassNotFoundException{
        String url=String.format("jdbc:mariadb://%s:%s/%s",HOST, PORT, DB_NAME);
        Class.forName(DRIVER);
        Connection conn= DriverManager.getConnection(url,USERNAME,PASSWORD);
        System.out.println("DB 접속 완료!");//getConnectin=static
        return conn;
    }
    public void close(Connection conn){
        if(conn==null){return;}
        try{
            conn.close();//예외때문에 빨간줄 throw하거나 해결(try catch)
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void close(Statement stat, Connection conn){
        if(stat!=null){
            try{
                stat.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        close(conn);
    }
    public void close(ResultSet rs, Statement stat, Connection conn){
        if(rs!=null){
            try{
                rs.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
class MyConnectionTest{
    public static void main(String[] args){
        MyConnection myConnection =new MyConnection();
        Connection conn=null;
        try {
            conn=myConnection.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally{
            myConnection.close(conn);
        }
    }
}
