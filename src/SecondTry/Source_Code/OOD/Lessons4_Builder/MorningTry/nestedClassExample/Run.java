package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.nestedClassExample;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Account alexkozl= Account.initializeRegistration().
                                login("alexxxx").
                                password("123456789").
                                email("nooope").age(12).createAccount();
        System.out.println(alexkozl.getInfo());
    }
}
