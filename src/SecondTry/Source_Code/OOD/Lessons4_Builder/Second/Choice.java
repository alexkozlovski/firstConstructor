package SecondTry.Source_Code.OOD.Lessons4_Builder.Second;

/**
 * Created by user on 12.10.2018.
 */
public abstract class Choice {
    protected Query query;
    public Query getQuery(){
        return query;
    }
    public void createQuery(){
        query=new Query();
    }
    public abstract void buildPizzaSause();
    public abstract void buildPizzaDough();
    public abstract void buildPizzaIngredients();

}
