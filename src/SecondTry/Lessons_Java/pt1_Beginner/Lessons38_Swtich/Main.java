package SecondTry.Lessons_Java.pt1_Beginner.Lessons38_Swtich;

public class Main {
    enum Days {MONDAY, WEDNSDAY, FRIDAY, TUESDAY}

    public static void main(String[] args) {
        Days d = Days.FRIDAY;
        switch (d) {
            case MONDAY:
                System.out.println("mond");
                break;
            //case FRIDAY:System.out.println("friday");break;
            case TUESDAY:
                System.out.println("tuesday");
                break;
            case WEDNSDAY:
                System.out.println("wednsday");
                break;

            default:
                System.out.println("default ble");
                break;

        }

    }
}

