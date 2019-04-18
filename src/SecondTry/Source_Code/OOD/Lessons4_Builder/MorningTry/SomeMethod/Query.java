package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod;

/**
 * Created by user on 02.11.2018.
 */
public class Query {
    private String dough;
    private  String sauce;
    private String[]  ingredients;

    public void setPizzaDough(String pizzaDough){
        System.out.printf("set pizza dough: %s\n",pizzaDough);
    }
    public void setPizzaSauce(String sauce){
        System.out.printf("set pizza saue: %s\n",sauce);
    }
    public void setPizzaIngredients(String... ingredients){
        System.out.printf("set pizza ingredients: %s\n",ingredients);
    }
}
