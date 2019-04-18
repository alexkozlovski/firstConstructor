package SecondTry.Lessons_Java.pt1_Beginner.Lessons19_Constructors;

public class ConstructExample {
    int i;
    ConstructExample(String str,int i) {
        this.i=i;
        System.out.println(str+" asd");

    }
}

class Run {
    public static void main(String[] args) {
        ConstructExample constructExample=new ConstructExample("hello",2);
        System.out.println(constructExample.i);
    }
}