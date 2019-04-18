package SecondTry.Source_Code.OOD.Lessons21_State.try1;

public class UndefinedUser implements State{
    @Override
    public void changeState(User user) {
        if(user.getState()==this) System.out.println("user now is undefined...");
        else {
            System.out.printf("user state was changed from %s, to %s%n",user.getState(),this);
            user.setState(this);
        }
    }

    @Override
    public String toString() {
        return "undefined";
    }
}
