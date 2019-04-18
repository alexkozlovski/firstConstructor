package SecondTry.Lessons_Java.pt1_Beginner.Lessons58_Anonymous_Classes.SecWithComparable;
            class Popcorn{
                void doSomething(){
                    System.out.println("popcorn");
                }
                void secondMethode(){
                    System.out.println("second methode said hello");
                }
            }

public class Main {
    public static void main(String[] args) {
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        comparable.compareTo(new Object());


    }
    static void  methode(Popcorn e){
        e.doSomething();
    }


}
