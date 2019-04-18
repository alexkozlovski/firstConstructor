package SecondTry.Lessons_Java.pt3_JDBC.Lessons_188_JDBC_6_SQL_REQUESTS;

import java.sql.*;

public class Run {
    public static void main(String[] args) throws SQLException {
        String name="admin";
        String pas="admin";
        String URL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection connection=DriverManager.getConnection(URL,name,pas);
            Statement statement=connection.createStatement()){
            statement.execute("drop TABLE if EXISTS books");
            statement.execute("CREATE TABLE if NOT EXISTS books(id MEDIUMINT NOT NULL auto_increment, name VARCHAR (30) not null,authorname VARCHAR (30) not null,PRIMARY KEY (id))");
            statement.execute("INSERT INTO books set name='java8',authorname='shildt'");
            statement.executeUpdate("INSERT into books set name='riddik',authorname='hzekov'");
            ResultSet resultSet=statement.executeQuery("select * from books");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name")+"  "+resultSet.getString("authorname"));
                //System.out.println(resultSet.getString("authorname"));
            }


        }

    }
}
