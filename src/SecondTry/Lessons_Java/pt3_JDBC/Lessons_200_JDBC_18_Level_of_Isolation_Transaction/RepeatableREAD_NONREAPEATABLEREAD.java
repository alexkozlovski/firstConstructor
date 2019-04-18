package SecondTry.Lessons_Java.pt3_JDBC.Lessons_200_JDBC_18_Level_of_Isolation_Transaction;

import java.sql.*;

public class RepeatableREAD_NONREAPEATABLEREAD {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";//&relaxAutoCommit=false
    public static String user = "admin";
    public static String pas = "admin";

    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try (Connection conn = DriverManager.getConnection(URL,user,pas);
             Statement statement = conn.createStatement()){


            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            ResultSet resultSet=statement.executeQuery("select * from books");
            while (resultSet.next()) System.out.println(resultSet.getString("name"));
            new OtherTransaction().start();
            Thread.sleep(2000);
            ResultSet resultSet2=statement.executeQuery("select * from books");
            while (resultSet2.next()) System.out.println(resultSet2.getString("name"));


        }catch(SQLException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static class OtherTransaction extends Thread{
        @Override
        public void run() {
            try(Connection conn = DriverManager.getConnection(URL,user,pas);
                Statement statement = conn.createStatement()){

                conn.setAutoCommit(false);
                conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
                statement.executeUpdate("UPDATE books set name='cococo' where id=2");
                conn.commit();
               // ResultSet resultSet=statement.executeQuery("Select * from books");
                /*while(resultSet.next()) System.out.println(resultSet.getString("name"));*/
                System.out.println("______________________");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
