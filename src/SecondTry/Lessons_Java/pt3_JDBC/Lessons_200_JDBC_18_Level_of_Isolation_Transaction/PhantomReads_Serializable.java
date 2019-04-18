package SecondTry.Lessons_Java.pt3_JDBC.Lessons_200_JDBC_18_Level_of_Isolation_Transaction;


import java.sql.*;

public class PhantomReads_Serializable {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";//&relaxAutoCommit=false
    public static String user = "admin";
    public static String pas = "admin";
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try (Connection conn = DriverManager.getConnection(URL,user,pas);
             Statement statement = conn.createStatement()){


            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            ResultSet resultSet=statement.executeQuery("select count(*) from books");
            while (resultSet.next()) System.out.println(resultSet.getString(1));
            new OtherTransaction().start();
            Thread.sleep(2000);
            ResultSet resultSet2=statement.executeQuery("select count(*) from books");
            while (resultSet2.next()) System.out.println(resultSet2.getString(1));


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
                statement.executeUpdate("insert into  books (name) VALUES ('new value2')");
                conn.commit();
                System.out.println("______________________");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
