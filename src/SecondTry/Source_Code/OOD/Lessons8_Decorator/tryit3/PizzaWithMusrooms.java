package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;

/**
 * Created by user on 14.10.2018.
 */
public class PizzaWithMusrooms extends PizzaDecorator {

    private final int MAX_COUNT = 3;
    private  int count=0;
    private int cost=1;
    private int  percentPerSize=10;

    public PizzaWithMusrooms(Pizza pizza,int count) {
        super(pizza,count);
        this.count=count;
    }

/**

 */
    @Override
    public double getTotallyCost() {

        if(count>0) return super.getTotallyCost() + this.getCost()*this.getCount();
        return super.getTotallyCost();
    }

    @Override
    public String getIngredients() {
        if(count>0) return super.getIngredients() + " +Mushrooms(x"+this.getCount()+")";

        return super.getIngredients();
    }

    @Override
    public int getMaxCount() {
        return MAX_COUNT;
    }

    @Override
    public int getCount() {

        return count;
    }

    @Override
    public void setCount(int count) {
        if(count>getMaxCount())this.count=getMaxCount();
    }


    public int getCost() {
        if(super.getSize().equalsIgnoreCase("M")){
            return  cost-=(cost*percentPerSize)/100;
        }
        if(super.getSize().equalsIgnoreCase("XL")){
            return   cost+=(cost*percentPerSize*2)/100;
        }
        return cost;
    }
}
