package SecondTry.Lessons_Java.pt3_JDBC.Lessons_193_JDBC_11_SEQUENCE_Stored_procedures;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 09.09.2018.
 */
public class Main2 {
    public static String URL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
    public static String user="admin";
    public static String pas=user;


    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection conn=DriverManager.getConnection(URL,user,pas);
            Statement statement=conn.createStatement()){
            statement.execute("drop TABLE if EXISTS NoteBooks");
            statement.executeUpdate("CREATE TABLE if not EXISTS  NoteBooks (id tinyint not null auto_increment, manufacturer VARCHAR (30), price long, PRIMARY KEY (id))");

            List<String> manufacturers = new ArrayList<String>();
            manufacturers.add("Asus");
            manufacturers.add("Acer");
            manufacturers.add("HP");
            manufacturers.add("MSI");
            Random random = new Random();
            PreparedStatement pstmtDataUploading=conn.prepareStatement("insert into NoteBooks (manufacturer, price) VALUES (?,?)");

            for (int i = 1; i <=10 ; i++) {
                pstmtDataUploading.setString(1,manufacturers.get(random.nextInt(3)+1));
                pstmtDataUploading.setInt(2,(random.nextInt(2000)*5+1)*i);
                pstmtDataUploading.execute();
            }

            CallableStatement clblstmt=conn.prepareCall("{call getInfoAboutNotebooks()}");
            boolean clblstmtHasRes=clblstmt.execute();
            while (clblstmtHasRes){
                ResultSet resultSet=clblstmt.getResultSet();
                while (resultSet.next()){
                    int i=1;
                    System.out.println(resultSet.getInt(1));
                }
                clblstmtHasRes=clblstmt.getMoreResults();
            }

        }
    }
}
