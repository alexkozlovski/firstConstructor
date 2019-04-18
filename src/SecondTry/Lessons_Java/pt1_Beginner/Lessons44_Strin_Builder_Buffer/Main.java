package SecondTry.Lessons_Java.pt1_Beginner.Lessons44_Strin_Builder_Buffer;

public class Main {
    public static void main(String[] args) {
        StringBuilder strbld=new StringBuilder("abc");
        strbld.append("defa");
        strbld.insert(1,"gogo");
        System.out.println(strbld);
    }
}
