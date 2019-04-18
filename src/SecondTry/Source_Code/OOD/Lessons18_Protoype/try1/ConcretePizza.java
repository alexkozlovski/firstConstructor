package SecondTry.Source_Code.OOD.Lessons18_Protoype.try1;


/**
 * Created by user on 15.11.2018.
 */
public class ConcretePizza implements PizzaPrototype {
    private String name="";
    private StringBuilder info;
    private String size="";
    private String sauce="";
    private String sausages="";
    private String cheese="";
    private String mushrooms="";


    public ConcretePizza(String name) {
        this.name = name;
        info=new StringBuilder("["+name+"]");
    }

    public void setSize(String size) {
        this.size = size;


    }

    public void setSauce(String sauce) {
        this.sauce = sauce;

    }

    public void setSausages(String sausages) {
        this.sausages = sausages;

    }

    public void setCheese(String cheese) {
        this.cheese = cheese;

    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;

    }


    @Override
    public PizzaPrototype make() throws CloneNotSupportedException {
        return (PizzaPrototype)super.clone();
    }
    public PizzaPrototype make(String newName) throws CloneNotSupportedException {
        this.name=newName;
        return (PizzaPrototype)super.clone();
    }
    public String getInfo(){
        return "["+name+"]"+(size.isEmpty()?"":" Size: \""+size+"\"")+
                (sauce.isEmpty()?"":" | Sauce: \""+sauce+"\"")+
                (sausages.isEmpty()?"":" | Sausages: \""+sausages+"\"")+
                (mushrooms.isEmpty()?"":" | Mushrooms: \""+mushrooms+"\"")+
                (cheese.isEmpty()?"":" | Cheese: \""+cheese+"\"")+".";
    }
}
