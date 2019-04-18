package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod;

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
    public void buildPizza(String dough,String sauce,String ingredients){
        choice.createQuery();
        choice.buildPizzaDough(dough);
        choice.buildPizzaSauce(sauce);
        choice.buildPizzaIngredients(ingredients);

    }
}
