package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        ChainOfResponsibility firstChain=new PositiveNumberHandler();
        ChainOfResponsibility secondChain=new NegativeNumblerHandler();
        ChainOfResponsibility thirdChain=new ZeroNumberHandler();
        firstChain.nextChain(secondChain);
        secondChain.nextChain(thirdChain);
        firstChain.requestProcess(new Number(-1));

    }
}
