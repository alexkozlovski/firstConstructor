package SecondTry.Lessons_Java.pt1_Beginner.Lessons50_Collection;

import java.util.ArrayList;

public class Test_methode_foreach {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        for (int i = 0; i < 10; i++) {

            list.add(new String("")+ Math.round(Math.random()*100-50));
        }
            list.forEach(System.out::println);
    }

}
