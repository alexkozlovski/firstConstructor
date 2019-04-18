package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.nestedClassExample;

/**
 * Created by user on 02.11.2018.
 */
public class Account {
    private String login;
    private String password;
    private int age;
    private  String email;

    public static Registrar initializeRegistration(){
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
        public Registrar age(int age){

            Account.this.age=age;
            return this;
        }
        public Account createAccount(){
            return Account.this;
        }

    }
    public String getInfo(){

        return "Login: "+this.login+", password: "+this.password+", Email: "+this.email+", age: "+this.age;
    }
}
