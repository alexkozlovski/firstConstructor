package SecondTry.Source_Code.OOD.Lessons5_Chain_of_Responsibility.tryYourSelf_naGit;




/**
 * Created by user on 12.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        ChainOfResponsibility first=new PositiveNumberHandler();
        ChainOfResponsibility second=new NegativeNumberHandler();
        ChainOfResponsibility third=new ZeroNumberHandler();
        first.nextChain(second);
        second.nextChain(third);
        first.requestProcess(new Number(-2));
        first.requestProcess(new Number(0));
        first.requestProcess(new Number(2));

    }
}
