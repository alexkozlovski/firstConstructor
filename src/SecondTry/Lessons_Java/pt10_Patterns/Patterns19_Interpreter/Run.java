package SecondTry.Lessons_Java.pt10_Patterns.Patterns19_Interpreter;

/**
 * Created by user on 04.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        String expression="1+2+3+5-3";//8
        Expression evaluator=new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));

    }
}
