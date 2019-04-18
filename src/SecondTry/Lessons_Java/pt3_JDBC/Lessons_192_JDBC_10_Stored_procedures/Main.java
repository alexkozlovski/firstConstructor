package SecondTry.Lessons_Java.pt3_JDBC.Lessons_192_JDBC_10_Stored_procedures;
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
            statement.executeUpdate("create table if not exists  BOOKS (id MEDIUMINT not null AUTO_INCREMENT,name VARCHAR (30) NOT NULL,PRIMARY KEY(id))");
            statement.executeUpdate("insert into books(name) VALUES ('somename')");
            statement.executeUpdate("insert into books(name) VALUES ('two')");
            statement.executeUpdate("insert into books(name) VALUES ('twoeas')");
            statement.executeUpdate("insert into books(name) VALUES ('twoeasasda')");
            statement.executeUpdate("insert into books(name) VALUES ('wetwoeasasda')");

            CallableStatement callableStatement=conn.prepareCall("{call BooksCount(?)}");
            callableStatement.registerOutParameter(1,Types.INTEGER);
           callableStatement.execute();
            System.out.println(callableStatement.getInt(1));
            System.out.println("______________");
            CallableStatement callableStatement1=conn.prepareCall("{call getBooks(?)}");
            callableStatement1.setInt(1,1);
            if(callableStatement1.execute()){
                ResultSet resultSet=callableStatement1.getResultSet();
                while (resultSet.next())
                    System.out.println(resultSet.getInt(1)+resultSet.getString("name"));



            }
        }
    }
}
