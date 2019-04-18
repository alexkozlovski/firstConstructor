package SecondTry.Lessons_Java.pt3_JDBC.Lessons_187_JDBC_5_connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        String userName="admin";
        String password="admin";
        String connectionURL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";//?servertimezone=UTC&useSSl=false"
        //Class.forName("com.mysql.jdbc.Driver").getInstance();

       DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             try (Connection con= DriverManager.getConnection(connectionURL,userName,password)){
           System.out.println("we're connected");
                 //ResultSet resultSet=
       }

    }
}
