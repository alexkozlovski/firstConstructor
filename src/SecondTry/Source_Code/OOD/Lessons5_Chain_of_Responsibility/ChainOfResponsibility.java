package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility;

/**
 * Created by user on 12.10.2018.
 */
public interface ChainOfResponsibility {
    void nextChain(ChainOfResponsibility nextChain);
    void requestProcess(Number number);

}
