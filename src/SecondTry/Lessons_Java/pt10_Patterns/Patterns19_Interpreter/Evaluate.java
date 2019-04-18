package SecondTry.Lessons_Java.pt10_Patterns.Patterns19_Interpreter;

import java.util.Stack;

/**
 * Created by user on 04.11.2018.
 */
public class Evaluate implements Expression {
    Expression evaluate;

    public Evaluate(String  expression) {
        Stack<Expression> expressions=new Stack<>();
        String expressionRevert=new StringBuilder(expression).reverse().toString();
        for (String s:expression.split("\\D")){
            expressions.push(new Number(Integer.parseInt(s)));
        }
        for (String s:expression.split("\\d")){
            if(s.equals("+")){
                expressions.push(new Plus(expressions.pop(),expressions.pop()));
            }else if(s.equals("-")){
                expressions.push(new Minus(expressions.pop(),expressions.pop()));
            }

        }
        evaluate=expressions.pop();
    }

    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}
