package SecondTry.Lessons_Java.pt4_Advanced.Lessons163_InnerClass;

public class InnerClaslesson {
    int i=4;
    static int j=6;
    Inner inner=new Inner();
    void method(){
        Inner inner=new Inner();
    }
    class Inner{
        int q=j,w=i;
         void method(){
            q=j+1;
        }
       final static int e=5;//во внутреннем классе может быть только final static поле
    }
    public static void main(String[] args) {

        Inner inner=new InnerClaslesson().new Inner();
    }
}
class OtherClass{
    InnerClaslesson.Inner inner=new InnerClaslesson().new Inner();
}