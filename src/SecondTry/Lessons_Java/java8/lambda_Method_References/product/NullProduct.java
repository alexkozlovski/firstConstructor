package SecondTry.Lessons_Java.java8.lambda_Method_References.product;

public class NullProduct  extends Product{
    @Override
    public void make() {
        System.out.println(" something wrong.\nundefined product...");
    }

    @Override
    public String toString() {
        return "NullProduct";
    }
}
