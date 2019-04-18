package SecondTry.Lessons_Java.pt3_JDBC.Lessons_190_JDBC_8_BINARY_LARGE_OBJECTS;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

/**
 * Created by user on 08.09.2018.
 */
public class Main3 {
    public static void main(String[] args) throws SQLException, IOException {
        String URL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        String user="admin";
        String pas=user;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection connection=DriverManager.getConnection(URL,user,pas);
            Statement statement=connection.createStatement()
        ){
            statement.execute("drop table if EXISTS Girls");
            statement.execute("create TABLE if not EXISTS Girls(id int not null auto_increment, name varchar(30) not null, city VARCHAR (30) not null,img blob, PRIMARY KEY (id))");
            statement.executeUpdate("insert into girls set name='helen', city='Minsk'");


            Blob blob=connection.createBlob();
            BufferedImage image= ImageIO.read(new File("girl.jpeg"));
           try(OutputStream outputStream=blob.setBinaryStream(1) ){

               ImageIO.write(image,"jpeg",outputStream);
               outputStream.flush();
               outputStream.close();
           }


            PreparedStatement preparedStatement=connection.prepareStatement("update Girls set img=? where name='helen'");
            preparedStatement.setBlob(1,blob);
            preparedStatement.execute();

            ResultSet resultSet=statement.executeQuery("select * from Girls where name='helen'");
            while(resultSet.next()){

                Blob blob1=resultSet.getBlob("img");
                BufferedImage image1=ImageIO.read(blob1.getBinaryStream());
                ImageIO.write(image1,"jpeg",new File("girlSave.jpeg"));
            }


        }
    }
}
