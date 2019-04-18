package SecondTry.Source_Code.OOD.Lessons18_Protoype;

/**
 * Created by user on 15.11.2018.
 */
public class ConcretePizza implements Pizza {
    private String size;
    private String sauce;
    private String cheese;
    private String mushrooms;
    private String sausages;

    public void setSize(String size) {
        this.size = size;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }

    public void setSausages(String sausages) {
        this.sausages = sausages;
    }

    @Override
    public Pizza make() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }
    public String getInfo(){
        return "[Pizza Builder]"+" Size:"+size+
                " | Sauce: "+sauce+
                " | Cheese: "+cheese+
                " | Mushrooms: "+mushrooms+
                " | Sausagees: "+sausages;
    }
}
