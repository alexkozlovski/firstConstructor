package SecondTry.Lessons_Java.pt3_JDBC.Lessons_190_JDBC_8_BINARY_LARGE_OBJECTS;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

/**
 * Created by user on 07.09.2018.
 */
public class Main2 {
    public static void main(String[] args) throws SQLException, IOException {
        String user="admin";
        String pas="admin";
        String url="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection connection=DriverManager.getConnection(url,user,pas);
            Statement statement=connection.createStatement();
        ){
            statement.execute("DROP TABLE if EXISTS cars");
            statement.execute("CREATE TABLE if not EXISTS cars(id mediumint auto_increment not null, model varchar(30) not null, img blob, PRIMARY key (id))");


            BufferedImage image= ImageIO.read(new File("car.jpg"));
            Blob blob=connection.createBlob();
            try (OutputStream outputStream=blob.setBinaryStream(1)){
                ImageIO.write(image,"jpg",outputStream);
                outputStream.flush();
                outputStream.close();
            }



            PreparedStatement preparedStatement=connection.prepareStatement("insert into cars set model=?, img=?");
            preparedStatement.setString(1,"FirstCar");
            preparedStatement.setBlob(2,blob);
            preparedStatement.execute();

            ResultSet resultSet=statement.executeQuery("SELECT * from cars");
            while (resultSet.next()){
                Blob blob1=resultSet.getBlob("img");
                BufferedImage image1=ImageIO.read(blob.getBinaryStream());
                File outputFile=new File("carSave.png");
                ImageIO.write(image1,"PNG",outputFile);


            }


        }
    }
}
