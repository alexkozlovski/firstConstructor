package SecondTry.Lessons_Java.java8.lambda_Method_References.product;

import java.util.GregorianCalendar;

public class TeslaRoadsterProduct extends Product {
    private static volatile TeslaRoadsterProduct instance;
    private String name=String.valueOf("TeslaRoadster v.2.0");
    private String info;
    @Override
    public void make() {
        //name+" product was made: "+new GregorianCalendar().getTime()+"."

        System.out.println(info);
    }
    public TeslaRoadsterProduct() {
        info=new StringBuilder().append(name).append(" product was made: ").
                append(new GregorianCalendar().getTime()).append(".").toString();
    }

    protected static TeslaRoadsterProduct getInstance(){
        TeslaRoadsterProduct localInstance=instance;
        if (localInstance==null){
            synchronized (TeslaRoadsterProduct.class){
                localInstance=instance;
                if(localInstance==null){
                    instance=localInstance=new TeslaRoadsterProduct();
                }
            }
        }
        return localInstance;
    }
    public String getInfo(){
        return info;
    }
    @Override
    public String toString(){
        return info;
    }
}
