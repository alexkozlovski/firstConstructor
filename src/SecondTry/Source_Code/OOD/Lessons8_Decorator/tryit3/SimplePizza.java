package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;

/**
 * Created by user on 14.10.2018.
 */
public class SimplePizza implements Pizza {
    private String size="L";
    private String dough="Thick";
    String ingredients=getIngredients();
    double cost=getTotallyCost();

    Pizza pizza;

    public SimplePizza(String size, String dough) {
        this.size = size;
        this.dough = dough;
    }
    public SimplePizza(){

    }
/*    public SimplePizza(){

    }*/

    @Override
    public double getTotallyCost() {
        if(size.equalsIgnoreCase("M")) return 3.5;
        if(size.equalsIgnoreCase("XL"))return 5.5;
        return 4.5;

    }

    @Override
    public String getIngredients() {
        return this.getDough()+" "+this.getSize()+" PizzaPrototype";
    }

    public String getSize() {
        return size;
    }



    public String getDough() {
        return dough;
    }
    public static PizzaMaker initPizza(String size,String dough){
        return new SimplePizza(size, dough).new PizzaMaker();
    }
    class PizzaMaker{
/*            public PizzaPrototype makeSimplePizza(String dough,String size){
                SimplePizza.this.size=size;
                SimplePizza.this.dough=dough;
                pizza=SimplePizza.this;
                return pizza;
            }*/
            public PizzaMaker addMushrooms(int count){
                //SimplePizza.this.ingredients=new PizzaWithMusrooms(pizza,2).getIngredients();
                pizza=new PizzaWithMusrooms(pizza,count);
               // pizza=new PizzaWithMusrooms(,count);
                return this;
            }
            public PizzaMaker addSausages(int count){
                pizza=new PizzaWithSausages(pizza,count);
                return this;
            }
            public Pizza buildPizza(){
                return pizza;
            }

    }
    public  Pizza build(String size, String dough, int numberOfSasages, int numberOfMushoorms, int numberOfonion) {
        pizza=new SimplePizza(size,dough);
            if(numberOfSasages>0)pizza=new PizzaWithSausages(pizza,numberOfSasages);
            if(numberOfMushoorms>0)pizza=new PizzaWithMusrooms(pizza,numberOfMushoorms);
            if(numberOfonion>0)pizza=new PizzaWithOnion(pizza,numberOfonion);
                return pizza;
       // return new PizzaWithSausages(new PizzaWithMusrooms(new PizzaWithOnion(new SimplePizza(size, dough), numberOfonion), numberOfMushoorms), numberOfSasages);
    }


}
