package SecondTry.Lessons_Java.pt1_Beginner.Lessons29_Overloading_pt2;

public class OverloadExample {
    public static void main(String[] args) {
        OverloadExample overloadExample=new OverloadExample();
        short b=21;
        overloadExample.methode( b);

    }
    void methode(int i){
        System.out.println("int");
    }
    /*void methode(long l){
        System.out.println("long");
    }*/
    void methode(Integer l){
        System.out.println("Integer");
    }
/*    void methode(double l){
        System.out.println("double");

    }*/
    void methode(short... l){
        System.out.println("short..");
    }
/*    void methode(Short l){
        System.out.println("Short");
    }*/
/*    void methode(Object l){
        System.out.println("Object");
    }*/
    void methode(Object... l){
        System.out.println("Object..");
    }
    void methode(byte l){
        System.out.println("byte");
    }

}
