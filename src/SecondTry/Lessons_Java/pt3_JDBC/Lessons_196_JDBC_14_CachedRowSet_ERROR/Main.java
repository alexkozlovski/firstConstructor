package SecondTry.Lessons_Java.pt3_JDBC.Lessons_196_JDBC_14_CachedRowSet_ERROR;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false&relaxAutoCommit=true";//&relaxAutoCommit=false
    public static String user = "admin";
    public static String pas = "admin";

    public static void main(String[] args) throws SQLException, InterruptedException, SQLException, ClassNotFoundException {
            ResultSet resultSet=getData();
        while (resultSet.next()) {
            System.out.println((resultSet.getInt(1))+"  "+resultSet.getString(2));
        }
        System.out.println("____________________________");
        CachedRowSet cachedRowSet=(CachedRowSet) resultSet;
        cachedRowSet.setUrl(URL); cachedRowSet.setUsername(user); cachedRowSet.setPassword(pas);


/*        cachedRowSet.setCommand("select * from books where id=?");
        cachedRowSet.setInt(1,1);
        cachedRowSet.setPageSize(20);
        cachedRowSet.execute();
        do{
            while (cachedRowSet.next()){
                System.out.println(cachedRowSet.getInt(("id"))+"    "+cachedRowSet.getString("name"));
            }
        }while (cachedRowSet.nextPage());*/
            CachedRowSet cachedRowSet2=(CachedRowSet) resultSet;
            cachedRowSet2.setTableName("books");
            cachedRowSet2.absolute(1);
            cachedRowSet2.deleteRow();
           // cachedRowSet2.beforeFirst();


/*            cachedRowSet2.absolute(1);
        for (int i=1; cachedRowSet2.next();i++ ) {
            cachedRowSet2.updateInt(1,i);
            cachedRowSet.updateRow();
        }*/
            while (cachedRowSet2.next()){

                System.out.println(cachedRowSet2.getInt(("id"))+"    "+cachedRowSet2.getString("name"));
            }

           cachedRowSet2.acceptChanges(DriverManager.getConnection(URL,user,pas));

 /*       cachedRowSet2.setUrl(URL);
        cachedRowSet2.setUsername(user);
        cachedRowSet2.setPassword(pas);
        cachedRowSet2.acceptChanges();*/






    }

    static ResultSet getData() throws SQLException, InterruptedException, ClassNotFoundException {
       // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
           // Connection conn=null;
        try (Connection conn = DriverManager.getConnection(URL, user, pas);
             Statement stmt = conn.createStatement()
        ) {
            //conn.setAutoCommit(false);
            stmt.execute("DROP TABLE if EXISTS books");
            stmt.executeUpdate("CREATE TABLE if not EXISTS books(id bigint not null auto_increment, name char(30) not null, PRIMARY KEY (id))");
            PreparedStatement prstmt = conn.prepareCall("insert into books(name) VALUE (?)");
            List<String> books = new ArrayList();
            books.add("Book Thied");
            books.add("How to coock pizza");
            books.add("Head First Java");
            books.add("Bruice Eckel Java Phylosophi");
            books.add("Zhirniy Sanya)");
            Random random = new Random(System.currentTimeMillis());
            for (int i = 1; i < 7; i++) {
                Thread.sleep(1 + i);
                int r = random.nextInt(4) + 1;
                prstmt.setString(1, books.get(r));
                prstmt.execute();
            }
            RowSetFactory rowSetFactory= RowSetProvider.newFactory();
            CachedRowSet cachedRowSet=rowSetFactory.createCachedRowSet();
            Statement stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = stmt1.executeQuery("SELECT * from books");
            cachedRowSet.populate(resultSet);
            //conn.commit();
            return cachedRowSet;
        }/*finally {
            new Connection().close();
        }*/


    }
}