package SecondTry.Lessons_Java.pt1_Beginner.Lessons28_Obertki_AutoBox_RegEX_STRtoInt;

public class Test {

    public static void main(String[] args) {

        String str= "a,c,v,Q,8,9";
        System.out.println(str.replaceAll("[^0-9],", ""));
        System.out.println(str.replaceAll("[^0-9]", ""));
        System.out.println(str.replaceAll("[^,0-9]", ""));
        System.out.println(str.toUpperCase());
    }
}