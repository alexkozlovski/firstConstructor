package SecondTry.Lessons_Java.pt1_Beginner.Lessons26_Inicialization_Blocks;
class Parent{
    Parent(){

        System.out.println("parent construct");
    }
}
public class InitExample extends Parent {
    {
        System.out.println("common block");
    }
    static{
        System.out.println("static block");
    }
    InitExample(){

        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InitExample();

    }
}
