package SecondTry.Lessons_Java.pt8_RegExp.Lessons249_dot;

/**
 * Created by user on 28.09.2018.
 */
public class Main2 {
    public static void main(String[] args) {
        String s="mama papa \"her\"";
        System.out.println(s.matches(".*"));//WAT?
        System.out.println(s.replaceAll("\".*\"","common shit"));
    }
}
