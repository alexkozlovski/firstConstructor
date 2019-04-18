package SecondTry.Lessons_Java.pt3_JDBC.Lessons_192_JDBC_10_Stored_procedures;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        String UserName = "admin";
        String PAS = "admin";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());


        try (Connection connection = DriverManager.getConnection(URL, PAS, UserName);
             Statement statement = connection.createStatement()) {
            statement.execute("drop TABLE if EXISTS NoteBooks");
            statement.execute("CREATE TABLE if not EXISTS NoteBooks(id mediumint not null auto_increment, manufacturer VARCHAR(30) not null, price long not null, PRIMARY  KEY (id) )");
            //PreparedStatement preparedStatement = connection.prepareStatement(/*"insert into NoteBook set manufacturer=?, price=? "*/"insert into NoteBook (manufacturer, price) VALUES (?,?)");
            List<String> manufacturers = new ArrayList<String>();
            manufacturers.add("Asus");
            manufacturers.add("Acer");
            manufacturers.add("HP");
            manufacturers.add("MSI");
            Random random = new Random();
/*            for (int i = 0; i < 10; i++) {
                int k = random.nextInt(manufacturers.size() - 1) + 1;
                preparedStatement.setString(1, manufacturers.get(k));
                int k1 = (int) Math.round(Math.random() * 100);
                System.out.println(k1);
                preparedStatement.setInt(2, k1);
                preparedStatement.execute();

            }*/
            PreparedStatement prepareAddDate=connection.prepareStatement("insert into NoteBooks (manufacturer, price) VALUES (?,?)");
            for (int i = 0; i < 10; i++) {

                int k = random.nextInt(manufacturers.size() - 1) + 1;
                int k1 = (int) Math.round(Math.random() * 10000) +k*3;
                //statement.executeUpdate("insert into NoteBooks set manufacturer='" + manufacturers.get(k) + "', price='" + k1 + "'");
                prepareAddDate.setString(1,manufacturers.get(k));
                prepareAddDate.setInt(2,k1);
                prepareAddDate.execute();

/*                ResultSet resultSet = callableStatement.executeQuery();
                if (resultSet.next()) System.out.println(resultSet.getString(1));*/

            }

            CallableStatement callableStatement = connection.prepareCall("{call getAVGprice()}");
/*            callableStatement.registerOutParameter(1,Types.INTEGER);
            callableStatement.execute();
            System.out.println(callableStatement.getInt(1));*/
            ResultSet resultSet = callableStatement.executeQuery();
            if (resultSet.next()) System.out.println(resultSet.getString("price"));
        }
    }
}