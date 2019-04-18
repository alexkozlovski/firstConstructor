package SecondTry.Lessons_Java.pt1_Beginner.Lessons25_Static_Q_Class_Inicialization;

public class StaticExample {
    public static int i;
    static int k=6;
    int j=6;

    public static int getI() {
        return i;
    }


    static {
        System.out.println("static inicialization");
    }

    {
        System.out.println("inicialization");
    }
    {
        System.out.println("second inicialization");
    }

    StaticExample() {
        i++;
        System.out.println("Constructor");
    }

    public static void gogo() {
        System.out.println("gogogogogo");
    }

    public static void main(String[] args) {
  /*      StaticExample staticExample = new StaticExample();*/
/*        new StaticExample();
        new StaticExample();
        new StaticExample();*/

        System.out.println(StaticExample.k);
        new StaticExample();
        new StaticExample();
        gogo();

    }
}
