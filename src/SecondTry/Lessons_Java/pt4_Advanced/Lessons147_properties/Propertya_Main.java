package SecondTry.Lessons_Java.pt4_Advanced.Lessons147_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 17.09.2018.
 */
public class Propertya_Main {
    public static void main(String[] args) {
        Properties defproperties=new Properties();
        defproperties.setProperty("bla","my default value");
        Properties properties=new Properties(defproperties);
        properties.setProperty("one","1");
        properties.setProperty("log","alex");
        properties.setProperty("pas","alexx");
        System.out.println(properties.getProperty("pas"));
/*        try2 {
            FileOutputStream out=new FileOutputStream("my.properties");
            properties.store(out,"my comments");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            FileInputStream in=new FileInputStream("my.properties");
            properties.load(in);
           // properties.
            System.out.println(properties.getProperty("alex"));
            System.out.println(properties.getProperty("bla"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
