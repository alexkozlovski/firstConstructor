package SecondTry.Lessons_Java.pt4_Advanced.Lessons170_Classes_Path_Q_Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 22.09.2018.
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("temp.txt").toAbsolutePath();
        Path path1=Paths.get("E:/");
        System.out.println(path.endsWith("temp.txt"));
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileSystem());
        System.out.println(path.getName(3));
        System.out.println(path.getClass());
        System.out.println(path.equals(path));
        System.out.println(path.isAbsolute());
        System.out.println(path1.compareTo(path));
        System.out.println("___________________________");
        java.util.List<String> list=new ArrayList<String>();
        list.add("new");
        list.add("2nd");
        Files.write(path,list);
        List<String> list1=Files.readAllLines(path);
        for (String s:list1) System.out.println(s);
        System.out.println(list1.contains("2nd"));


        try(DirectoryStream<Path> entries=Files.newDirectoryStream(Paths.get("."))){
            for (Path path2:entries) System.out.println(path2.getFileName());
        }
    }
}
