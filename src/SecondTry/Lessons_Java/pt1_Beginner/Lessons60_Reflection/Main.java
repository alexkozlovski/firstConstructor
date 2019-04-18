package SecondTry.Lessons_Java.pt1_Beginner.Lessons60_Reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        Class clss2=SomeClass.class;
        Class clss3=Class.forName("SecondTry.Lessons_Java.pt1_Beginner.Lessons60_Reflection.SomeClass");
        System.out.println(clss.getName());

        System.out.println("");
        System.out.println("Constructors:");
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor construct : constructors) {

            System.out.println("construct.getName()"+construct.getName()+".");
            Parameter[] parameters = construct.getParameters();
            for (Parameter param : parameters) {
                System.out.println("param.getName=  "+param.getName()+".");
                System.out.println("param.getType().getName()=  "+param.getType().getName()+".");
            }


        }
        System.out.println();
        System.out.println("Methods:");
        Method[] methods=clss.getDeclaredMethods();
        for (Method method :methods) {
            System.out.println("имя метода "+method.getName()+".");
            Parameter[] parameters = method.getParameters();
            for (Parameter param :parameters ) {
                System.out.println("param.getName=  "+method.getName()+".");
                System.out.println("param.getType().getName()=  "+param.getType().getName()+".");
            }
            System.out.println(Modifier.toString(method.getModifiers()));
        }

        Field[] fields=clss.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field:
             fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            field.setAccessible(true);
            System.out.println(field.getInt(someClass));
           field.setInt(someClass,1);
            System.out.println(field.getInt(someClass));
        }



    }
}

class SomeClass {
    public   int i;
    String s;

    public SomeClass() {

    }

    public SomeClass(String s) {
        this.s = s;
    }

    public String Somethode(String s) {
        System.out.println("this s= " + s);
        return s;
    }

    public String getName() {
        return "SomeClass from Lessons60";
    }
}
