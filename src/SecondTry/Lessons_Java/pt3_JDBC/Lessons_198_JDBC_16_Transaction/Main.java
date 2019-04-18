package SecondTry.Lessons_Java.pt3_JDBC.Lessons_198_JDBC_16_Transaction;

import javax.xml.stream.XMLStreamException;
import java.sql.*;
/**
 * Created by user on 10.09.2018.
 */
public class Main {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";//&relaxAutoCommit=false
    public static String user = "admin";
    public static String pas = "admin";

    //https://www.programcreek.com/java-api-examples/?class=java.sql.DatabaseMetaData&method=getTables
    //https://www.programcreek.com/java-api-examples/?code=ranji1221/clemon/clemon-master/core/core-common/src/main/java/org/ranji/lemon/common/core/util/JdbcUtil.java
    public static void main(String[] args) throws SQLException, ClassNotFoundException, XMLStreamException, InterruptedException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        // Class.forName("com.mysql.jdbc.Driver");
        Connection conn=null;
        try {
            conn = DriverManager.getConnection(URL, user, pas);
            Statement stmt = conn.createStatement();
            conn.setAutoCommit(false);
            stmt.execute("DROP TABLE if EXISTS books");
            stmt.executeUpdate("CREATE TABLE if not EXISTS books(id mediumint not null auto_increment, name char(30) not null, PRIMARY KEY (id))");
            PreparedStatement preparedStatement=conn.prepareStatement("insert into books (name) VALUES (?)");

            preparedStatement.setString(1,"kek");
            preparedStatement.execute();
            Savepoint savepoint=conn.setSavepoint();
            preparedStatement.setString(1,"shkek");
            preparedStatement.execute();
            preparedStatement.setString(1,"shmek");
            preparedStatement.execute();
            preparedStatement.setString(2,"Lolkek");
            preparedStatement.execute();

           // conn.releaseSavepoint(savepoint);
            conn.commit();
        }catch (SQLException e){
            System.out.println(e.toString());
            conn.rollback();
        }
    }
}