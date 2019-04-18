package SecondTry.Lessons_Java.pt3_JDBC.Lessons_188_JDBC_6_SQL_REQUESTS;

import java.sql.*;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        String userName="admin";
        String password="admin";
        String connectionURL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try (Connection conn=DriverManager.getConnection(connectionURL,userName,password);
             Statement statement=conn.createStatement()){
            statement.execute("drop table if exists books");
            statement.executeUpdate("create table if not exists Books(id MEDIUMINT not null AUTO_INCREMENT,name VARCHAR (30) NOT NULL ,PRIMARY KEY(id))");
                statement.executeUpdate("insert into books (name) values ('Java8')");
                statement.executeUpdate("insert into books (name) values ('Java9')");
                statement.executeUpdate("insert into books (name) values ('lola keka')");
                statement.executeUpdate("insert into books set name='morg' ");
            ResultSet resultSet=statement.executeQuery("select name from books ");
            while (resultSet.next()) System.out.println(resultSet.getString("name"));
        }


    }
}
