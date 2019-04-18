package SecondTry.obrazovanie_online.Lessons22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Run {
    public static void main(String[] args) throws ClassNotFoundException {
        /*Class c=Class.forName("java.io.InputStream");*/
        Class c=Class.forName("SecondTry.obrazovanie_online.Lessons22.A");
        String str=c.getName();
        System.out.println(str);
        Constructor[] constr=c.getConstructors();
        for (int i = 0; i <constr.length ; i++) {
            System.out.println(i+1+" "+constr[i]);
        }
        Class[] interfaces=c.getInterfaces();
        for (int i = 0; i <interfaces.length ; i++) {
            System.out.println(i+" "+interfaces[i]);
        }
        System.out.println(Modifier.isPublic(c.getModifiers()));
        int asd=c.getModifiers();
        System.out.println(asd);
        System.out.println(Modifier.isAbstract(1025));
        Method[] methods=c.getMethods();
        for (int i = 0; i <methods.length ; i++) {
            System.out.println(methods[i]);
        }
        Field[] fields=c.getFields();
        for (int i = 0; i <fields.length ; i++) {
            System.out.println(fields[i]);
        }

    }
}
