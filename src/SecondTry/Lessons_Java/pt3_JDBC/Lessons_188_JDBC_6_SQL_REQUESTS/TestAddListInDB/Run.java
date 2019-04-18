package SecondTry.Lessons_Java.pt3_JDBC.Lessons_188_JDBC_6_SQL_REQUESTS.TestAddListInDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 07.09.2018.
 */
public class Run {
    public static void main(String[] args) {
        List<String> names=new ArrayList();
        names.add("alex");
        names.add("alena");
        names.add("lesha");
        String user="admin";
        String password="admin";
        String URL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        //jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false
        try{

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con= DriverManager.getConnection(URL,user,password);
            Statement statement=con.createStatement();
            statement.execute("drop table if EXISTS names");
            statement.execute("CREATE TABLE if not EXISTS NAMES(id mediumint auto_increment not null , name VARCHAR(30) not null ,PRIMARY key (id))");
            for (String str:names) {
                statement.executeUpdate("INSERT into NAMES set NAME ='"+str+"'");
            }

            /*statement.executeUpdate("insert into NAMES ")*/
        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
