package SecondTry.Lessons_Java.pt10_Patterns.Patterns19_Interpreter;

/**
 * Created by user on 04.11.2018.
 */
public class Number implements Expression{
    int number;
    public Number(int number) {
        this.number = number;
    }
    @Override
    public int interpret(Expression context) {
        return number;
    }


}
