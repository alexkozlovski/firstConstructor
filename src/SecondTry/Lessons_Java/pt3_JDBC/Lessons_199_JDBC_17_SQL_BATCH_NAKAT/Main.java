package SecondTry.Lessons_Java.pt3_JDBC.Lessons_199_JDBC_17_SQL_BATCH_NAKAT;

import java.sql.*;

public class Main {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";//&relaxAutoCommit=false
    public static String user = "admin";
    public static String pas = "admin";
    static Connection conn=null;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try{

            conn=DriverManager.getConnection(URL,user,pas);
            Statement statement=conn.createStatement();
            conn.setAutoCommit(false);
            statement.addBatch("DROP TABLE if EXISTS Books");
            statement.addBatch("CREATE TABLE Books(id tinyint not NULL auto_increment,name VARCHAR (30) not null, PRIMARY key (id))");
            statement.addBatch("insert into Books (name) VALUES ('vasya')");
            statement.addBatch("insert into Books (name) VALUES ('basya')");
            statement.addBatch("insert into Books (name) VALUES ('masya')");
            statement.addBatch("insert into Books (name) VALUES ('xasya')");
            if (statement.executeBatch().length==6) conn.commit();





        }catch (SQLException e){
            System.out.println("huy znaet esli 4e");
            e.printStackTrace();

        }



    }
}
