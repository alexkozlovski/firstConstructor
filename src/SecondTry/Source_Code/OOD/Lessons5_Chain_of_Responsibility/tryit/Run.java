package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.tryit;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        ChainOfResponsibility first=new PostiveNumberHandler();
        ChainOfResponsibility second=new NegativeNumberHandler();
        ChainOfResponsibility third=new ZeroNumberHandler();

        first.nextChain(second);
        second.nextChain(third);
        first.processNumber(new Number(2));
        first.processNumber(new Number(0));
        first.processNumber(new Number(-2));

    }
}
