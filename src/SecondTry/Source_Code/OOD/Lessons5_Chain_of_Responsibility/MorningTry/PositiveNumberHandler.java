package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class PositiveNumberHandler implements ChainOfResponsibility {
    ChainOfResponsibility chain;
    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain=nextChain;
    }

    @Override
    public void requestProcess(Number number) {
        if(number.getNumber()>0) System.out.println("positive number: "+number.getNumber());
        else{
            chain.requestProcess(number);
        }
    }
}
