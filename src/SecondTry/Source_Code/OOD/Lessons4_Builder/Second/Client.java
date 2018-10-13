package SecondTry.Source_Code.OOD.Lessons4_Builder.Second;

/**
 * Created by user on 12.10.2018.
 */
public class Client {
    private Choice choice;
    public void setChoice(Choice choice){
        this.choice=choice;
    }
    public Query acceptQuery(){
        System.out.println("Order accepted");
        return choice.getQuery();
    }
    public void buildPizza(){
        choice.createQuery();
        choice.buildPizzaDough();
        choice.buildPizzaSause();
        choice.buildPizzaIngredients();
    }
}
