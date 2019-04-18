package SecondTry.Lessons_Java.pt3_JDBC.Lessons_197_JDBC_15_Metadata;

import javax.xml.stream.XMLStreamException;
import java.sql.*;

public class Main {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";//&relaxAutoCommit=false
    public static String user = "admin";
    public static String pas = "admin";
//https://www.programcreek.com/java-api-examples/?class=java.sql.DatabaseMetaData&method=getTables
    //https://www.programcreek.com/java-api-examples/?code=ranji1221/clemon/clemon-master/core/core-common/src/main/java/org/ranji/lemon/common/core/util/JdbcUtil.java
    public static void main(String[] args) throws SQLException, ClassNotFoundException, XMLStreamException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               // Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(URL, user, pas);
             Statement stmt = conn.createStatement();
        ) {
            stmt.execute("DROP TABLE if EXISTS books");
            stmt.executeUpdate("CREATE TABLE if not EXISTS books(id mediumint not null auto_increment, name char(30) not null, PRIMARY KEY (id))");

            DatabaseMetaData databaseMetaData=conn.getMetaData();
            //databaseMetaData.nullPlusNonNullIsNull();
            ResultSet resultSet=databaseMetaData.getTables(null,null,"%",new String[]{"table"/*,"VIEW"*/});
            while(resultSet.next()){
                //System.out.println(resultSet.getString(1));
               // System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));

            }
        }
    }
}