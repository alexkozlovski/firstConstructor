package SecondTry.Lessons_Java.pt3_JDBC.Lessons_189_JDBC_7_SQL_Injection_preparementStatement;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String name="admin";
        String pass="admin";
        String URL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection conn=DriverManager.getConnection(URL,pass,name);
            Statement statement=conn.createStatement();
        ){

            statement.execute("drop table if exists Users");
            statement.executeUpdate("create table if not exists Users(id MEDIUMINT not null AUTO_INCREMENT, name VARCHAR(30) NOT NULL, password varchar(30) not null,PRIMARY KEY(id))");
            statement.executeUpdate("insert into Users (name,password) values ('Alex','81675356378')");
            statement.executeUpdate("insert into Users set name='vlaaad', password='232379'");


           String userId="1";
           //String userId="1' or 1 ='1";
/*            ResultSet resultSet=statement.executeQuery("select * from Users where id='"+userId+"'");
            while (resultSet.next()){
                System.out.print("user name: "+resultSet.getString("name"));
                System.out.println(" password: "+resultSet.getBigDecimal("password")+".");
            }*/
PreparedStatement preparedStatement=conn.prepareStatement("select * from Users where id=?");
            preparedStatement.setString(1,userId);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print("user name: "+resultSet.getString("name"));
                System.out.println(", password: "+resultSet.getString("password")+".");
            }

        }

    }
}
