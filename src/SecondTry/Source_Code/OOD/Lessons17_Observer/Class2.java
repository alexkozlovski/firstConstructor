package SecondTry.Source_Code.OOD.Lessons17_Observer;

public class Class2 extends Class {

    Class2(double d){
        this((int)d);
        System.out.println("Class2(double)");
    }
    Class2(int i){
        System.out.println("Class2 2 int");
    }
    public static void main(String[] args) {
        new Class2(2.2);
    }

}
class Class {
    Class(){
        System.out.println("Class def");
    }    Class(int i){
        System.out.println("Class int i");
    }
}
