package SecondTry.Lessons_Java.pt3_JDBC.Lessons_189_JDBC_7_SQL_Injection_preparementStatement;

import java.sql.*;



public class Run2 {
    public static void main(String[] args) throws SQLException {
        String user="admin";
        String pas="admin";
        String URL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        try(Connection conn= DriverManager.getConnection(URL,user,pas);
            Statement statement=conn.createStatement()
        ){
            statement.execute("DROP TABLE IF EXISTS costumer");
            statement.execute("CREATE TABLE if not EXISTS costumer(id mediumint not null auto_increment, name VARCHAR(30) not null, City VARCHAR(30) not null,PRIMARY KEY (id))");
            statement.executeUpdate("insert into costumer set name='pidor', city='London'");
            statement.executeUpdate("insert into costumer set name='pidorok', city='Minsk'");
            statement.executeUpdate("insert into costumer set name='pidor', city='Vitebsk'");
            statement.executeUpdate("insert into costumer set name='pidorok123', city='London'");


            String city="London";
            PreparedStatement preparedStatement=conn.prepareStatement("SELECT name from costumer where city=?");
            preparedStatement.setString(1,city);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) System.out.print(resultSet.getString("name")+" ");

        }
    }
}
