package SecondTry.Lessons_Java.pt3_JDBC.Lessons_188_JDBC_6_SQL_REQUESTS;

import javax.xml.parsers.ParserConfigurationException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException,SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String userName="admin";
        String password="admin";
        String connectionURL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        try (Connection conn= DriverManager.getConnection(connectionURL,userName,password);
            Statement statement=conn.createStatement()){
            statement.execute("drop table Books");
            statement.executeUpdate("create table if not exists Books(id MEDIUMINT not null AUTO_INCREMENT,name VARCHAR (30) NOT NULL ,PRIMARY KEY(id))");
            statement.executeUpdate("insert into Books (name) values ('inferno')");
            statement.executeUpdate("insert into Books set name ='Solomon key'");
            ResultSet resultSet=statement.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+"    "+resultSet.getString("name"));
                System.out.println("---------------------");
            }
            System.out.println("_____________________");
            ResultSet resultSet2=statement.executeQuery("select name  from Books where id=1");
            while (resultSet2.next()){
                System.out.println(resultSet2.getString("name"));
            }
        }


}
}
