package SecondTry.Lessons_Java.pt1_Beginner.Lessons56_Generics.try2_Main2;

import java.util.ArrayList;
import java.util.List;

class Parent{
    void methodes(){
        System.out.println("b");
    }
}
class Child extends Parent{
    int a;

}
class Son extends Child{
        @Override
    void methodes(){
            System.out.println("im son)");
        }
}
public class Main2 {
    public static void main(String[] args) {
        List<Parent> list=new ArrayList<>();
        list.add(new Child());
        list.add(new Child());
        list.add(new Parent());
        Main2 main=new Main2();
        main.methode(list);




    }

    /**
     * в экстенде ниже по иерарххи и нельзя добавлять в коллекции
     * в super выше по иерархии и можем добавлять себя и ниже по иерархии
     * @param list нельзя создавать дженерик массив. статические переменные тоже
     */
    void methode(List<? super Child> list){
        //list.add(new Son());
        //list.forEach(p -> System.out.print(p+"      "));
        for (Object o:
             list) {
            Child p=(Child) o;
            p.methodes();
        }
    }
}
