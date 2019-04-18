package SecondTry.Lessons_Java.pt4_Advanced.Lessons164_Local_Classes;

/**
 * Created by user on 21.09.2018.
 */
public class LocalInnerClassesLesson {
    static int i=5;
    int j=6;
    void does(int e){
        int r=5;
        //Local local=new Local(); нельзя))) ниже

        class Local{
            final static int q=2;
            int w=j;
            int t= e;
            int y=r;
        }
        Local local=new Local();//использовать внутренний класс можно только после его определния, т.е. ниже
    }
    void does2(){
        class Local{

        }
    }
    public static void main(String[] args) {

    }

}
