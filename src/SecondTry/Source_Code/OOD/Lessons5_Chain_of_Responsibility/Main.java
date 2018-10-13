package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility;

/**
 * Created by user on 12.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        ChainOfResponsibility firstChain=new NegativeNumberHandler();
        ChainOfResponsibility secondChain=new PostiveNumberHandler();
        ChainOfResponsibility thirdChain=new ZeroNumberhandler();
        firstChain.nextChain(secondChain);
        secondChain.nextChain(thirdChain);
        firstChain.requestProcess(new Number(-1));
        firstChain.requestProcess(new Number(0));
        firstChain.requestProcess(new Number(-1));
    }
}
