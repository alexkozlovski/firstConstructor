package SecondTry.Lessons_Java.pt4_Advanced.Lessons166_Try_With_resources_Q_AutoClosable;

import java.io.*;

/**
 * Created by user on 22.09.2018.
 */
public class TryWithResourcesLesson {
    static class MyClass implements AutoCloseable{
        @Override
        public void close(){

        }
    }
    public static void main(String[] args) {
//        Reader reader=null;
//        try2 {
//             reader=new FileReader(new File("somefile"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            try2 {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        try2(Reader reader=new FileReader(new File("kek")); Writer writer=new FileWriter(new File("asd"))){
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        try(MyClass myClass=new MyClass()){

        }

    }
}
