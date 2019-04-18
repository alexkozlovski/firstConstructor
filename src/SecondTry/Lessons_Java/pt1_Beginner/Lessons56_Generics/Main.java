package SecondTry.Lessons_Java.pt1_Beginner.Lessons56_Generics;


import java.util.*;

class Parent{

        }
        class Child extends Parent{

        }
        class Son extends Parent{

        }
public class Main {
    public static void main(String[] args) {
        List<Parent> list=new ArrayList<>();
        list.add(new Child());
        list.add(new Child());
        list.add(new Parent());
        Main main=new Main();
        main.methode(list);




    }
    void methode(List<? extends Parent> list){
        list.forEach(p -> System.out.print(p+"      "));

    }
}
