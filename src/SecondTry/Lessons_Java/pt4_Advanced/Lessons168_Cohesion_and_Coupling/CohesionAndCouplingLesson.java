package SecondTry.Lessons_Java.pt4_Advanced.Lessons168_Cohesion_and_Coupling;

/**
 * Created by user on 22.09.2018.
 */
public class CohesionAndCouplingLesson {
    public static void main(String[] args) {

    }
}
//coupling - it is suggested that all modules should be independent as far as possible
class A{
  private int i;
    public int getI(){
        return i;
    }
}
class B{
    void printI(){
        System.out.println(new A().getI());
    }
}






//cohesion - один класс не должен реализовывать кучу методов. т.е. high cohesion mean what code should be close to each other
class Zakusochnaya{
    Cook employee;
    Waiter waiter;
    Janitor janitor;
}
class Cook{
    void cook(){

    }

}
class Waiter{
    void dilerFood(){

    }

}
class Janitor{
    void clearFloor(){

    }
}