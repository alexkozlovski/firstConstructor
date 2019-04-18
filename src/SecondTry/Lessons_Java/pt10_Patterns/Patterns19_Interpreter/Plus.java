package SecondTry.Lessons_Java.pt10_Patterns.Patterns19_Interpreter;

/**
 * Created by user on 04.11.2018.
 */
public class Plus implements Expression{
    Expression expressionLeft;
    Expression expressionRight;

    public Plus(Expression expressionLeft,Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight=expressionRight;
    }

    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context)+expressionRight.interpret(context);
    }
}
