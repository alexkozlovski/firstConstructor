package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public interface ChainOfResponsibility {
        void nextChain(ChainOfResponsibility nextChain);
        void requestProcess(Number number);
}
