package exams.Tests.staticTest;

import java.util.ArrayList;
import java.util.List;

public class Test {

    {
        System.out.println("block");
    }
    static {
        System.out.println("static");
    }
    int a=getA();

    private int getA() {
        System.out.println("A");
        return 1;
    }

    static int i=getI();
    public static int getI(){
        System.out.println("I");
        return 2;
    }

    public static void main(String [] args) {
        new Test();

    }


}
