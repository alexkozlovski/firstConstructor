package SecondTry.Source_Code.OOD.Lessons4_Builder;

/**
 * Created by user on 12.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Account  account=Account.initializeRegistration().
                login("admin").
                password("root").
                email("nope").createAccount();
    }
}
