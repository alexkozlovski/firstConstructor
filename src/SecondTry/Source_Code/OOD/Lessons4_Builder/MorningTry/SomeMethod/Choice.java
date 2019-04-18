package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod;

/**
 * Created by user on 02.11.2018.
 */
public abstract class Choice {
    private Query query;
    public Query getQuery(){
        return query;
    }
    public void createQuery(){
        query=new Query();
    }
    public abstract void buildPizzaDough(String dough);
    public abstract void buildPizzaSauce(String sauce);
    public abstract void buildPizzaIngredients(String ingredients);

}
