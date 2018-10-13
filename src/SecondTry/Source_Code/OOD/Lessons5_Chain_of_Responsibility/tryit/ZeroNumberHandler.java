package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.tryit;

/**
 * Created by user on 13.10.2018.
 */
public class ZeroNumberHandler implements ChainOfResponsibility{
    ChainOfResponsibility chain;
    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void processNumber(Number number) {
        if(number.getNumber()==0){
            System.out.println("zero: "+number.getNumber());
        }else {
            chain.processNumber(number);
        }
    }
}
