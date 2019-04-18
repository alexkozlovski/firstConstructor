package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;

/**
 * Created by user on 14.10.2018.
 */
public class PizzaWithSausages extends PizzaDecorator {
    private final int MAX_COUNT = 3;
    private  int count=0;
    private int cost=2;
    private int  percentPerSize=25;


    public PizzaWithSausages(Pizza pizza, int count) {
        super(pizza,count);
        this.count=count;
    }

    @Override
    public double getTotallyCost() {
        if (count>0)return super.getTotallyCost()+this.getCost()*this.getCount();
        return super.getTotallyCost();
    }


    @Override
    public String getIngredients() {
        if(count>0) return super.getIngredients() + " +Sausages(x"+this.getCount()+")";
        return super.getIngredients();
    }

    @Override
    public int getMaxCount() {
        return MAX_COUNT;
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
