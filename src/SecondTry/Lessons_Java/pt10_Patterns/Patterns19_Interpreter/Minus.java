package SecondTry.Lessons_Java.pt10_Patterns.Patterns19_Interpreter;

/**
 * Created by user on 04.11.2018.
 */
public class Minus extends Plus {
    public Minus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context)-expressionRight.interpret(context);
    }
}
