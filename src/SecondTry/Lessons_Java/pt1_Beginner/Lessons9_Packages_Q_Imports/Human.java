package SecondTry.Lessons_Java.pt1_Beginner.Lessons9_Packages_Q_Imports;
import SecondTry.Lessons_Java.pt1_Beginner.Lessons9_Packages_Q_Imports.com.max.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Human {
    Car carra;
    Plane plane;

    public static void main(String[] args) throws ClassNotFoundException {

        Class clas = Class.forName("SecondTry.Lessons_Java.pt1_Beginner.Lessons9_Packages_Q_Imports.com.max.Car");
        Field[] modifiers = clas.getFields();
        for (Field f :
                modifiers) {
            System.out.println(f);
        }

        System.out.println("++++++===================+++++");
        Constructor[] constructors=Class.forName("SecondTry.Lessons_Java.pt1_Beginner.Lessons9_Packages_Q_Imports.com.max.Car").getConstructors();
        for (Constructor c:
             constructors) {
            System.out.println(c);
        }

    }
}
