package SecondTry.Lessons_Java.pt3_JDBC.Lessons_195_JDBC_13_ResultSet_Update;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 09.09.2018.
 */
public class Main {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
    public static String user = "admin";
    public static String pas = user;

    public static void main(String[] args) throws SQLException, InterruptedException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        try(Connection conn=DriverManager.getConnection(URL,user,pas);
            Statement stmt=conn.createStatement();
        ){
            stmt.execute("DROP TABLE if EXISTS books");
            stmt.executeUpdate("CREATE TABLE if not EXISTS books(id bigint not null auto_increment, name char(30) not null, PRIMARY KEY (id))");
            PreparedStatement prstmt=conn.prepareCall("insert into books(name) VALUE (?)");
            List<String> books=new ArrayList();
            books.add("Book Thied");
            books.add("How to coock pizza");
            books.add("Head First Java");
            books.add("Bruice Eckel Java Phylosophi");
            books.add("Zhirniy Sanya)");
            Random random=new Random(System.currentTimeMillis());
            for (int i = 1-1; i <7; i++) {
                Thread.sleep(1+i);
                int r=random.nextInt(4)+1;
                prstmt.setString(1,books.get(r));
                prstmt.execute();
            }
            Statement stmt1=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet=stmt1.executeQuery("SELECT * from books");
            while (resultSet.next()){
                System.out.print((resultSet.getInt("id"))+" ");
                System.out.println(resultSet.getString("name"));
            }
            resultSet.last();
            resultSet.updateString(2,"new value");
            resultSet.updateRow();

            resultSet.moveToInsertRow();
            resultSet.updateString(2,"inserted row");
            resultSet.insertRow();

            resultSet.absolute(2);
            resultSet.deleteRow();


            resultSet.beforeFirst();
            System.out.println("____________________________");
            while (resultSet.next()){
                System.out.println((resultSet.getInt(1))+" "+resultSet.getString(2));
            }


        }
    }
}
