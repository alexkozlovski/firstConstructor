package SecondTry.Lessons_Java.pt4_Advanced.Lessons167_is_A_or_has_A;

/**
 * Created by user on 22.09.2018.
 */
public class IsAHasALesson {
    public static void main(String[] args) {

    }
}
class Telega{
    int weels=4;
}
//is a
class Car extends Telega{
    int weels=4;
    void drive(){

    }
}
class Radio{
    void listen(){
        System.out.println("listen Radio");
    }
}
class vihcle extends Radio{

}