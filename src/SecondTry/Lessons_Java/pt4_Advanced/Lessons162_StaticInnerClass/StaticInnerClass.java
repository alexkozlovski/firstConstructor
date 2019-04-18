package SecondTry.Lessons_Java.pt4_Advanced.Lessons162_StaticInnerClass;

/**
 * Created by user on 21.09.2018.
 */
public class StaticInnerClass {
   private static  int i=1;
    int j=2;

   static class Inner{
      private static int q=2;
        int w=3;

       void method(){
           System.out.println("metInner3hod");
       }

       int getI(){
           return i;
       }
    }
        static class Inner2 extends Inner{

        }
        class Inner3 extends Inner{
            @Override
            void method() {
                System.out.println("inner3");
            }
        }
    public static void main(String[] args) {
       StaticInnerClass staticInnerClass=new StaticInnerClass();
        Inner inner=staticInnerClass.new Inner3();
        inner.method();
    }
}
class OtherClass{
    public static void main(String[] args) {
        //StaticInnerClass staticInnerClass=new StaticInnerClass();
        StaticInnerClass.Inner inner=new StaticInnerClass.Inner();
        System.out.println(inner.getI());

    }
}