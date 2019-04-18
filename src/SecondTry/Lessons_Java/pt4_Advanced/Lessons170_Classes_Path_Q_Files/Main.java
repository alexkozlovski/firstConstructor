package SecondTry.Lessons_Java.pt4_Advanced.Lessons170_Classes_Path_Q_Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by user on 22.09.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("temp.txt").toAbsolutePath();
/*        File file=new File("temp.txt");
        path=file.toPath();*/
/*        System.out.println(path.getParent());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        Files.copy(Paths.get("temp.txt"),Paths.get("temp2.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.move(Paths.get("temp2.txt"),Paths.get("temp3.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(Paths.get("temp3.txt"));*/
//        System.out.println(Files.size(path));
//        System.out.println(Files.isDirectory(path));
//        System.out.println(Files.isExecutable(path));
//        System.out.println(Files.isHidden(path));
//        System.out.println(Files.isDirectory(path));
/*        byte[] bytes=Files.readAllBytes(path);
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }*/
        Files.write(path,"1\n2".getBytes());


        java.util.List<String> list=Files.readAllLines(Paths.get("temp.txt"));
        System.out.println("__________________");
        for (String s: list) System.out.println(s);
    }
}
