package SecondTry.Lessons_Java.pt1_Beginner.Lessons6_Data_Type;

public class Run {

    byte b=0; //1byte(256) -128 -127    -2^7 to +2^7-1
    short s=1234;//2byte(65000) -32k - +32k
    int i=12341231;//4byte
    long l=123123123123l;
    float f=12.3f;
    boolean bool;
    char ch;
    public static void main(String[] args) {
        double d=Double.POSITIVE_INFINITY;
        int a=(int)d;
        System.out.println(Math.round(Math.sqrt((double) a)));

    }
}
