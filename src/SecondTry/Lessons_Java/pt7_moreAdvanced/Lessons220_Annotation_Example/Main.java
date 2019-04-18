package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons220_Annotation_Example;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;


/**
 * Created by user on 27.09.2018.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Main main=new Main();
        Person person=new Person();
        main.print(person,person.getClass());
    }
    void print(Object o,Class cl) throws IllegalAccessException {
       Field[] fields= cl.getDeclaredFields();
       for(Field field:fields){
           Annotation[] annotations=field.getDeclaredAnnotations();
           for (Annotation annotation:annotations){
               if(annotation.annotationType().equals(Show.class)){
                   System.out.println(field.get(o));
               }
           }
       }
    }
}
@Retention(RetentionPolicy.RUNTIME)

@interface Show{
    boolean value() default true;
}
class Person{
    @Show
    String name="Alex";
    int age=22;
}