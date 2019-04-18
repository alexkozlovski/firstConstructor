package SecondTry.Source_Code.OOD.Lessons12_Interpreter;

/**
 * Created by user on 04.11.2018.
 */
public class Context {
    public String getBinaryExpresseion(int number){
        return Integer.toBinaryString(number);
    }
    public String getOctalExpression(int number){
        return Integer.toOctalString(number);
    }
    public String getHexadecimalExpresseion(int number){
        return Integer.toHexString(number);
    }
}
