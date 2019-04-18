package SecondTry.Lessons_Java.pt3_JDBC.Lessons_191_JDBC_9_DATE_AND_sequence;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        String UserName = "admin";
        String PAS = "admin";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try (Connection conn = DriverManager.getConnection(URL, UserName, PAS);
             Statement statement = conn.createStatement()) {
            statement.execute("drop table if exists books");
            statement.executeUpdate("create table if not exists  BOOKS (id MEDIUMINT not null AUTO_INCREMENT,name VARCHAR (30) NOT NULL, dt DATE ,PRIMARY KEY(id))");

/*            PreparedStatement preparedStatement=conn.prepareStatement("insert into books(name,dt) VALUES ('somename',?)");
            preparedStatement.setDate(1,new Date(1536190947800L));
            preparedStatement.execute();
            System.out.println(preparedStatement);*/
            statement.executeUpdate("insert into books(name,dt) VALUES ('somename','2018-09-05')");
            ResultSet resultSet=statement.executeQuery("select * from books");
            while (resultSet.next()) System.out.println(resultSet.getDate("dt"));
        }
    }
}