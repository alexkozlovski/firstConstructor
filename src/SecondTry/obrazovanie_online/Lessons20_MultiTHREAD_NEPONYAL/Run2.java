package SecondTry.obrazovanie_online.Lessons20_MultiTHREAD_NEPONYAL;

public class Run2 {
    public static void main(String[] args) {
        new ThisThread(900,"First");
        new ThisThread(900,"Second");
    }
}
