package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.tryit;

/**
 * Created by user on 13.10.2018.
 */
public interface ChainOfResponsibility {
    void nextChain(ChainOfResponsibility nextChain);
    void processNumber(Number number);
}
