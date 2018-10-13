package SecondTry.Source_Code.OOD.Lessons4_Builder.TryYourSelf;

/**
 * Created by user on 12.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Account account=Account.initializeRegistration().
                login("alex").password("secretniypassword").
                email("asd@gmail.ru").createAccount();
        Account account2=Account.initializeRegistration().
                login("alex2").password("secretniypassword").
                email("asd@gmail.ru").createAccount();
        new Account();
        new Account();
        Account account3=Account.initializeRegistration().
                login("alex2").password("secretniypassword").
                email("asd@gmail.ru").createAccount();
        System.out.println(account.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
    }
}
