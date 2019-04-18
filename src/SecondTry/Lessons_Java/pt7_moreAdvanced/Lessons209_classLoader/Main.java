package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons209_classLoader_NEAPONYAL;


import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Policy;


public class Main extends Policy {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        URL[] url=new URL[]{new URL("src.SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons209_classLoader.car.jar")};
        URLClassLoader pluginClassLoader=new URLClassLoader(url);
        Class<?> cl=pluginClassLoader.loadClass("com.app.car.Car");
        //Class c1 =pluginClassLoader.loadClass("Car");
        Method[] methods=cl.getDeclaredMethods();
        for (Method method :methods) {
            System.out.println("имя метода "+method.getName()+".");
            Parameter[] parameters = method.getParameters();
            for (Parameter param :parameters ) {
                System.out.println("param.getName=  "+method.getName()+".");
                System.out.println(" param.getType().getName()=  "+param.getType().getName()+".");
            }
            System.out.println(Modifier.toString(method.getModifiers()));
        }
    }
    class myClassLoader extends ClassLoader{
        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            byte[] bytes=new byte[0];
            try{
                bytes= Files.readAllBytes(Paths.get("filename"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Class<?> cl=defineClass(name,bytes,0,bytes.length);
            return cl;

        }
    }

}
