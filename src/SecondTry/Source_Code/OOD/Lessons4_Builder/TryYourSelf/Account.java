package SecondTry.Source_Code.OOD.Lessons4_Builder.TryYourSelf;

/**
 * Created by user on 12.10.2018.
 */
public class Account {
    private String login;
    private String password;
    private String email;
    private static int countAccaount;
    private int accountNumber=countAccaount;


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public static Registrar initializeRegistration(){
        countAccaount++;

        return new Account().new Registrar();
    }

    public class Registrar{
        public Registrar login(String login){
            Account.this.login=login;
            return this;
        }
        public Registrar password(String password){
            Account.this.password=password;
            return this;
        }
        public Registrar email(String email){
            Account.this.email=email;
            return this;
        }
        public Account createAccount(){
            return Account.this;
        }

    }
    @Override
    public String toString(){
        return "User №"+this.accountNumber+": [Login: "+this.getLogin()+", "+this.getPassword()+" "+this.getEmail()+"].";
    }
}
