package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility;

/**
 * Created by user on 12.10.2018.
 */
public class NegativeNumberHandler implements ChainOfResponsibility{
    private ChainOfResponsibility chain;
    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain=nextChain;
    }

    @Override
    public void requestProcess(Number number) {
        if(number.getNumber()<0){
            System.out.println("NegativeNumberHandler: "+number.getNumber());
        }else {
            chain.requestProcess(number);
        }
    }
}
