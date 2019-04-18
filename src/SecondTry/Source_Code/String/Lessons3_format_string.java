package SecondTry.Source_Code.String;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

public class Lessons3_format_string {
    public static void main(String[] args) {
        double a=1.0/3.0;
        System.out.println(a);
        System.out.println(String.format(Locale.ENGLISH,"formatted string a=%.2f %n",a));
        System.out.println(String.format("koko %s=%d%n","Age",22));
        System.out.printf("a=%.2f %n",a);
        int b=14;
        System.out.println("decimal numb"+b);
        System.out.printf("hexdecimal number is %x %n %n",b);
        StringBuilder stringBuilder=new StringBuilder();
        Formatter formatter=new Formatter(stringBuilder);
        formatter.format(Locale.ENGLISH,"PI=%.2f%n",Math.PI);
        System.out.println(stringBuilder);
        //BUT!
        String formattedPI=new DecimalFormat(".00").format(123.02);
        System.out.println(formattedPI);
    }
}
