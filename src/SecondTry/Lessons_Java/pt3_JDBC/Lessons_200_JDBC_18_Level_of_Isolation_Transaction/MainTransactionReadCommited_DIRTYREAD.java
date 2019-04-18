package SecondTry.Lessons_Java.pt3_JDBC.Lessons_200_JDBC_18_Level_of_Isolation_Transaction;

import java.sql.*;


public class MainTransactionReadCommited_DIRTYREAD {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";//&relaxAutoCommit=false
    public static String user = "admin";
    public static String pas = "admin";
    static Connection conn=null;
    public static void main(String[] args) throws SQLException, InterruptedException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try{conn=DriverManager.getConnection(URL,user,pas);
            Statement statement=conn.createStatement();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            statement.executeUpdate("UPDATE books set name='new val' where id=2 ");
            new otherTrasnaction().start();
            Thread.sleep(2000);
            conn.rollback();
            ResultSet resultSet=statement.executeQuery("Select * from books");
            while(resultSet.next()) System.out.println(resultSet.getString("name"));

        }catch (SQLException e){
            e.printStackTrace();
        }


        }
    static class otherTrasnaction extends Thread{
        @Override
        public void run() {
            try{
                conn=DriverManager.getConnection(URL,user,pas);
                Statement statement=conn.createStatement();
                conn.setAutoCommit(false);
                conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
                ResultSet resultSet=statement.executeQuery("Select * from books");
                while(resultSet.next()) System.out.println(resultSet.getString("name"));
                System.out.println("______________________");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}
