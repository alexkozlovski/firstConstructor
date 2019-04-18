package SecondTry.Lessons_Java.pt4_Advanced.Lessons159_Static_Inicialaizer;

public class StaticInitLesson {

    public static void main(String[] args) {
        System.out.println(i);

    }
    static {
        i=10;
    }
    static int i=0;
    static {
        i++;
    }
}
