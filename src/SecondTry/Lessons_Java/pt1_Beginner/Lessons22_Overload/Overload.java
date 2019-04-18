package SecondTry.Lessons_Java.pt1_Beginner.Lessons22_Overload;

public class Overload {
    int addTwodigits(int a,int b){
        return a+b;
    }

    double addTwodigits(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(new Overload().addTwodigits(2,2.5));
        System.out.println(new Overload().addTwodigits(2,2));
    }
}
