package SecondTry.Lessons_Java.pt1_Beginner.Lessons24;


 class Parent{
    int methode(){
        return 1;
    }
}
class Child extends Parent{
    int methode(){
        return 2;
    }
}
public class OverrideExample {
    public static void main(String[] args) {
        Parent parent=new Parent();
        Child child=new Child();
        Parent parentchild=new Child();


        System.out.println("parent  "+parent.methode());
        System.out.println("child  "+child.methode());
        System.out.println("parentchild  "+parentchild.methode());

    }
}