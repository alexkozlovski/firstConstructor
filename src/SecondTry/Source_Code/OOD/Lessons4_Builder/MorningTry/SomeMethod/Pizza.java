package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod;

/**
 * Created by user on 02.11.2018.
 */
public class Pizza extends Choice {
    @Override
    public void buildPizzaDough(String dough) {
        this.getQuery().setPizzaDough(dough);
    }

    @Override
    public void buildPizzaSauce(String sauce) {
this.getQuery().setPizzaSauce(sauce);
    }

    @Override
    public void buildPizzaIngredients(String ingredients) {
        this.getQuery().setPizzaIngredients(ingredients);
    }
}
