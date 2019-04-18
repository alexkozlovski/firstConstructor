package SecondTry.Lessons_Java.pt1_Beginner.Lessons28_Obertki_AutoBox_RegEX_STRtoInt;

public class Run {
    Integer i=new Integer(2);
    Integer j=new Integer("20");
/*    int anInt=Integer.parseInt("1011101",10);*/


    public static void main(String[] args) {
        System.out.println(new Run().i+"    "+new Run().j+" "+new MyInteger().myParseInt("as20"));

    }
    static class MyInteger{
        public static int myParseInt(String s){
            int i=Integer.parseInt(s.replaceAll("[^1-9]", ""));
            return i;

        }
    }
}
