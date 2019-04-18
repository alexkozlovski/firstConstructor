package Quizful.test3;
class Class1{
    Class1(int i){
        System.out.println("class1(int)");
    }
}
public class quest17 extends Class1 {
     quest17(int i) {// compile error
         super(i); //без этого никак. дефолтного конструктора нет. а вызвать родителя надо
         System.out.println("class2(int)");
     }
    quest17(double d) {
         this((int)d);
        System.out.println("class2(double)");
    }

    public static void main(String[] args) {
        new quest17(0.0);
    }
}

