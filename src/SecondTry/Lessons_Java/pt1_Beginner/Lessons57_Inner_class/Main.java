package SecondTry.Lessons_Java.pt1_Beginner.Lessons57_Inner_class;

public class Main {

    private int i=4;
    private static int qq=123;
    Inner inner=new Inner();
    static class Staticclass{
        static void methode(){
            System.out.println("static class methode was called by"+new Staticclass().toString()+qq);

        }
        public String toString(){
            return "Statck class)";
        }
    }
    public static void main(String[] args) {

        Main main=new Main();
        //MainTransactionReadCommited_DIRTYREAD.methode();
        Inner inner=main.new Inner();
        //inner.methode2();
       Second second=new Second();
        second.methode();
        new Staticclass().methode();


    }

    void methode(){
        Inner inner=new Inner();
        inner.methode2();

    }
    class Inner  {
        private int k=5;
        void methode2(){
            System.out.println(i);
        }
        class DoubleInner{
            void methode3(){
                DoubleInner doubleInner=new DoubleInner();
                System.out.println(doubleInner);
            }
            @Override
            public String toString(){
                return "this is class-object DoubleInner, catch";
            }
        }
    }
}
class Second{
    void methode(){
        Main.Inner inner=new Main(). new Inner();
        inner.methode2();
        Main.Inner.DoubleInner asd=new Main().new Inner().new DoubleInner();
       asd.methode3();
    }
}