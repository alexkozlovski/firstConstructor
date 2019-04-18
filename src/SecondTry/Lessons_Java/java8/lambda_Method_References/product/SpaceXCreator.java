package SecondTry.Lessons_Java.java8.lambda_Method_References.product;

public class SpaceXCreator extends Creator {
        private static volatile SpaceXCreator instance;

    @Override
    public Product manage(String creatorProduct) {
        if (creatorProduct.equalsIgnoreCase("falcon9"))return Falcon9Product.getInstance();
        return new NullProduct();
    }
    public static SpaceXCreator getInstance(){
        SpaceXCreator localInstance=instance;
        if (localInstance==null){
            synchronized (SpaceXCreator.class){
                localInstance=instance;
                if(localInstance==null){
                    instance=localInstance=new SpaceXCreator();
                }
            }
        }
        return localInstance;

    }
}
