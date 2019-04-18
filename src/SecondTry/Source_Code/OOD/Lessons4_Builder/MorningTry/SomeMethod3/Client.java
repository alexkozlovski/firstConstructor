package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod3;

/**
 * Created by user on 02.11.2018.
 */
public class Client {
    private Choice choice;
    public void setChoice(Choice choice){
        this.choice=choice;
    }
    public Query acceptQuery(){
        System.out.println("order accepted");
        return choice.getQuery();
    }
    public void makeSomthing(String name,String color){
        choice.createQuery();
        choice.getQuery().setName(name);
        choice.getQuery().setColor(color);
    }

}
