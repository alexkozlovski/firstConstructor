package SecondTry.Source_Code.OOD.Lessons16_Null_Object.try1;

/**
 * Created by user on 15.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        AbstractOS windows=OSFactory.createOS("windows");
        System.out.printf("Title: %s,isNull?: %s %n",windows.getTitle(),windows.isNull());
        AbstractOS chromeOS=OSFactory.createOS("chromeOS");
        System.out.printf("Title: %s,isNull?: %s %n",chromeOS.getTitle(),chromeOS.isNull());
        AbstractOS mint=OSFactory.createOS("mint");
        System.out.printf("Title: %s,isNull?: %s %n",mint.getTitle(),mint.isNull());
    }
}
