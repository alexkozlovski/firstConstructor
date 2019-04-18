package SecondTry.Source_Code.OOD.Lessons12_Interpreter;

/**
 * Created by user on 04.11.2018.
 */
public class BinaryExpression implements Expression {
    private int number;

    public BinaryExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpret(Context context) {
        return context.getBinaryExpresseion(number);
    }
}
