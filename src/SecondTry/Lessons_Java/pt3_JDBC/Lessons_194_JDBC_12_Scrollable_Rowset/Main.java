package SecondTry.Lessons_Java.pt3_JDBC.Lessons_194_JDBC_12_Scrollable_Rowset;

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

    public static void main(String[] args) throws SQLException, InterruptedException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        try(Connection conn=DriverManager.getConnection(URL,user,pas);
            Statement stmt=conn.createStatement();
        ){
            stmt.execute("DROP TABLE if EXISTS books");
            stmt.executeUpdate("CREATE TABLE if not EXISTS books(id tinyint not null auto_increment, name char(30) not null, PRIMARY KEY (id))");
            PreparedStatement prstmt=conn.prepareCall("insert into books(name) VALUE (?)");
            List<String> books=new ArrayList();
            books.add("Book Thied");
            books.add("How to coock pizza");
            books.add("Head First Java");
            books.add("Bruice Eckel Java Phylosophi");
            books.add("Zhirniy Sanya)");
            Random random=new Random(System.currentTimeMillis());
            for (int i = 0; i <7; i++) {
                Thread.sleep(1+i);
                int r=random.nextInt(4)+1;
            prstmt.setString(1,books.get(r));
            prstmt.execute();
            }
            Statement smtt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
           // PreparedStatement prprdstmt=conn.prepareStatement("",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet=stmt.executeQuery("select * FROM books");
            if(resultSet.next())
            System.out.println(resultSet.getString("name"));
            if (resultSet.next()) System.out.println(resultSet.getString("name"));
            if (resultSet.previous()) System.out.println(resultSet.getString("name"));
            if (resultSet.relative(2)) System.out.println(resultSet.getString("name"));
            if (resultSet.relative(-2)) System.out.println(resultSet.getString("name"));
            if (resultSet.absolute(2)) System.out.println(resultSet.getString("name"));
            if (resultSet.first()) System.out.println(resultSet.getString("id"));
            if (resultSet.last()) System.out.println(resultSet.getString("id"));

        }
    }
}
