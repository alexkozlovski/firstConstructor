package SecondTry.Lessons_Java.pt4_Advanced.Lessons160_Final;

/**
 * Created by user on 21.09.2018.
 */
public class FinalLessons {
    final int i=5;
    public static void main(String[] args) {
        One one=new Two();
       one.executeMethod();

    }
}


class One{
   private final void method(){
        System.out.println("one");
    }
    void executeMethod(){
        One one=new Two();
        one.method();

    }
}


class Two extends One{
    void method(){
        System.out.println("two");

    }
}