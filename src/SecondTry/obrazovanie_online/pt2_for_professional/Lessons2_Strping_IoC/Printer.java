package SecondTry.obrazovanie_online.pt2_for_professional.Lessons2_Strping_IoC;

/**
 * Created by user on 22.09.2018.
 */
public class Printer implements Iprintf {
    private String str;
    public Printer(String str){
        this.str=str;
    }

    @Override
    public void print() {

    }
}
