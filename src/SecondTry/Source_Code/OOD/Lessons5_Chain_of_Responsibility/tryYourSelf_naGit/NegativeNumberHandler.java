package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.tryYourSelf_naGit;

/**
 * Created by user on 12.10.2018.
 */
public class NegativeNumberHandler implements ChainOfResponsibility{
    ChainOfResponsibility chain;
    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void requestProcess(Number number) {
        if(number.getNumber()<0){
            System.out.println("NegativeNumberHandler:"+number.getNumber());
        }else {
            chain.requestProcess(number);
        }
    }
}
