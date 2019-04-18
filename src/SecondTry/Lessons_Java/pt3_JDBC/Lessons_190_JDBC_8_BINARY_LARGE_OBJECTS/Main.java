package SecondTry.Lessons_Java.pt3_JDBC.Lessons_190_JDBC_8_BINARY_LARGE_OBJECTS;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, IOException,IIOException {
    String URL="jdbc:mysql://localhost:3306/task1_Two_Sum?serverTimezone=UTC&useSSl=false";
        String UserName="admin";
        String PAS="admin";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try(Connection conn=DriverManager.getConnection(URL,UserName, PAS);
        Statement statement=conn.createStatement()){
                statement.execute("drop table if exists books");
               statement.executeUpdate("create table if not exists  BOOKS (id MEDIUMINT not null AUTO_INCREMENT,name VARCHAR (30) NOT NULL, img BLOB ,PRIMARY KEY(id))");
            BufferedImage image= ImageIO.read(new File("smile.jpg"));
            Blob blob=conn.createBlob();
/*            try2(OutputStream outputStream=blob.setBinaryStream(1)){
                ImageIO.write(image,"jpg",outputStream);
            }*/
            OutputStream outputStream=blob.setBinaryStream(1);
                ImageIO.write(image,"jpg",outputStream);
            outputStream.flush();
            outputStream.close();


            PreparedStatement preparedStatement=conn.prepareStatement("insert into books(name,img) values(?,?)");
            preparedStatement.setString(1,"inferno");
            preparedStatement.setBlob(2,blob);
            preparedStatement.execute();

            ResultSet resultSet=preparedStatement.executeQuery("select * from books");
            while (resultSet.next()){
                Blob blob1=resultSet.getBlob("img");
                BufferedImage image1=ImageIO.read(blob1.getBinaryStream());
                        File outputfile=new File("saved.png");
                ImageIO.write(image1,"png",outputfile);
            }
        }
    }
}
