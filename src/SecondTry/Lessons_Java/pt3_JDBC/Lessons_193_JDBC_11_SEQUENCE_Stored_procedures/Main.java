package SecondTry.Lessons_Java.pt3_JDBC.Lessons_193_JDBC_11_SEQUENCE_Stored_procedures;

import java.sql.*;
//http://techmyguru.com/jdbc/index.php?section=8/JDBC_CallableStatement_interface_example
//https://programmaticponderings.com/2012/08/24/calling-sql-server-stored-procedures-with-java-using-jdbc/
public class Main {
    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false","admin","admin");
            Statement statement=connection.createStatement()){
            statement.execute("drop table if exists books");
            statement.executeUpdate("create table if not exists  BOOKS (id MEDIUMINT not null AUTO_INCREMENT,name VARCHAR (30) NOT NULL,PRIMARY KEY(id))");
            //statement.executeUpdate("create table if not exists Books(id mediumint not null auto_increment,name char(30) not null, primary key (id) ");
            statement.executeUpdate("insert into books (name) values ('solo')");
            statement.executeUpdate("insert into books (name) values ('ne solo')");
            statement.executeUpdate("insert into books (name) values ('new')");
                CallableStatement callableStatement=connection.prepareCall("{call getCount()}");
                boolean hasResults=callableStatement.execute();
                while (hasResults){
                    ResultSet resultSet=callableStatement.getResultSet();
                    while (resultSet.next()){
                        System.out.println(resultSet.getInt(1));
                    }
                    hasResults=callableStatement.getMoreResults();
                }
        }
    }
}
