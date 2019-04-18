package SecondTry.Lessons_Java.pt3_JDBC.Lessons_189_JDBC_7_SQL_Injection_preparementStatement;

import java.sql.*;

/**
 * Created by user on 07.09.2018.
 */
public class Run1 {
    public static void main(String[] args) throws SQLException {
        String log="admin";
        String pas="admin";
        String url="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection con=DriverManager.getConnection(url,log,pas);
            Statement statement=con.createStatement()
        ){
            statement.execute("DROP TABLE if EXISTS names");
            statement.executeUpdate("CREATE TABLE if not EXISTS names(id mediumint not null auto_increment, name VARCHAR (30) not null, money bigint, PRIMARY KEY (id))");

            statement.executeUpdate("INsert INTO names set name='helen',money='800'");
            statement.executeUpdate("INsert INTO names set name='alex',money='200'");
            statement.executeUpdate("INsert INTO names set name='alexey',money='300'");
            statement.executeUpdate("INsert INTO names set name='someone',money='1000'");


            String usID="1";
            PreparedStatement preparedStatement=con.prepareStatement("select * from names where id=?");
            preparedStatement.setString(1,usID);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("id: "+resultSet.getString("name")+" "+resultSet.getInt("money"));
            }


        }
    }
}
