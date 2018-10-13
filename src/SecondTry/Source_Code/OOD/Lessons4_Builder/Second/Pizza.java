package SecondTry.Source_Code.OOD.Lessons4_Builder.Second;

/**
 * Created by user on 12.10.2018.
 */
public class Pizza extends Choice {
    @Override
    public void buildPizzaSause() {
        query.setPizzaDough("XL, thin");
    }

    @Override
    public void buildPizzaDough() {
        query.setPizzaDough("Barbecue");
    }

    @Override
    public void buildPizzaIngredients() {
        query.setPizzaIngredients("Sausages, onions,mushrooms, mazzarella");
    }
}
