package SecondTry.Lessons_Java.pt10_Patterns.Patterns19_Interpreter;

/**
 * Created by user on 04.11.2018.
 */
public interface Expression {
    int interpret(Expression context);
}
