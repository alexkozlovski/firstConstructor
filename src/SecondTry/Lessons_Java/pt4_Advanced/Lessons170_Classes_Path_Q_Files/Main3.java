package SecondTry.Lessons_Java.pt4_Advanced.Lessons170_Classes_Path_Q_Files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

/**
 * Created by user on 22.09.2018.
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("temp.txt").toAbsolutePath();
        Files.walkFileTree(Paths.get("."),new HashSet<FileVisitOption>(),1,new MyFileVisitor());
        Files.copy(path,Paths.get("temp2.txt"),StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(Paths.get("temp2.txt"));
    }
    static class MyFileVisitor extends SimpleFileVisitor<Path>{
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)throws IOException{
            System.out.println(file.getFileName());
            return FileVisitResult.CONTINUE;
        }
    }
}
