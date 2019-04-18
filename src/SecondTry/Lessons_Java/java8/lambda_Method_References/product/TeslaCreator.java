package SecondTry.Lessons_Java.java8.lambda_Method_References.product;

public class TeslaCreator extends Creator {
    private static volatile TeslaCreator instance;

    @Override
    public Product manage(String creatorProduct) {
        if (creatorProduct.equalsIgnoreCase("teslaroadster")) return TeslaRoadsterProduct.getInstance();
        else return new NullProduct();
    }

    public static Creator getInstance() {
        TeslaCreator localInstance = instance;
        if (localInstance == null) {
            synchronized (TeslaCreator.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new TeslaCreator();
                }
            }
        }
        return localInstance;

    }
}
