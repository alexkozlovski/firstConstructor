package SecondTry.Lessons_Java.pt8_RegExp.Lessons260_AtimicGroup;

/**
 * Created by user on 09.10.2018.
 */
public class main {
    public static void main(String[] args) {
        //(?>group)
        System.out.println("abcc".matches("a(bc|b)c"));
        System.out.println("abc".matches("a(bc|b)c"));
        System.out.println("abcc".matches("a(?>bc|b)c"));
        System.out.println("abc".matches("a(?>bc|b)c"));

        System.out.println("Intgers".matches("\\b(integer|insert|in)\\b"));
        System.out.println("Intgers".matches("\\b(?>integer|insert|in)\\b"));
    }
}
