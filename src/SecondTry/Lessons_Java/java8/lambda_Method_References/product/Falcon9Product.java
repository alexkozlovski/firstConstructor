package SecondTry.Lessons_Java.java8.lambda_Method_References.product;
import java.util.GregorianCalendar;


public class Falcon9Product extends Product {
    private static volatile Falcon9Product instance;
    private String name=String.valueOf("Falcon9 v.1.2");
    private String info;
    @Override
    public void make() {
        //name+" product was made: "+new GregorianCalendar().getTime()+"."
        info=new StringBuilder().append(name).append(" product was made: ").
                append(new GregorianCalendar().getTime()).append(".").toString();
        System.out.println(info);
    }
    protected static Falcon9Product getInstance(){
        Falcon9Product localInstance=instance;
        if (localInstance==null){
            synchronized (Falcon9Product.class){
                localInstance=instance;
                if(localInstance==null){
                    instance=localInstance=new Falcon9Product();
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
