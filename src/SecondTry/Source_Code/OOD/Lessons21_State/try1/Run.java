package SecondTry.Source_Code.OOD.Lessons21_State.try1;

public class Run {
    public static void main(String[] args) {
        User alex=new User("Alex");
        System.out.println(alex.getState());
        State admin=new Administrator();
        admin.changeState(alex);
    }
}
