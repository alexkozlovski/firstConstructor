package SecondTry.Source_Code.OOD.Lessons12_Interpreter;



public class Run {
    private  Context context;
    public Run(Context context){
        this.context=context;

    }
    public static void main(String[] args) {
        String binary="256 in Binary: ";
        String octal="256 in Octal: ";
        String hexadecimal="256 in Hexadecimal: ";
        Run expresseion=new Run(new Context());
        System.out.println(binary+expresseion.interpret(binary));
        System.out.println(octal+expresseion.interpret(octal));
        System.out.println(hexadecimal+expresseion.interpret(hexadecimal));

    }
    private String interpret(String text){
        Expression expression;

        if(text.contains("Binary")){
            expression=new BinaryExpression(Integer.parseInt(text.substring(0,text.indexOf(" "))));
        }else if(text.contains("Octal")){
            expression=new OctalExpression(Integer.parseInt(text.substring(0,text.indexOf(" "))));
        }else if(text.contains("Hexadecimal")){
            expression=new HexadecimalExpression(Integer.parseInt(text.substring(0,text.indexOf(" "))));
        }
        else {
            return text;
        }
        return expression.interpret(context);
    }
}
