package SecondTry.Lessons_Java.pt1_Beginner.Lessons58_Anonymous_Classes;
            class popcorn{
                void doSomething(){
                    System.out.println("popcorn");
                }
                void secondMethode(){
                    System.out.println("second methode said hello");
                }
            }
public class Main {
    public static void main(String[] args) {
        popcorn popcorn=new popcorn(){
            void doSomething(){
                System.out.println("MainTransactionReadCommited_DIRTYREAD");
                super.doSomething();
            }
        };
        popcorn.doSomething();
        popcorn.secondMethode();

    }
}
