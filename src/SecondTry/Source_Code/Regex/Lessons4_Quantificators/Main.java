package SecondTry.Source_Code.Regex.Lessons4_Quantificators;

import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.compile("10{2}").matcher("100").find());//содержит единицу и два 0
        System.out.println(Pattern.compile("10{1,3}").matcher("10").find());//1 и от одного до 3 нулей
        System.out.println(Pattern.compile("10{2,}").matcher("100").find());//два и более 0
        System.out.println(Pattern.compile("10?").matcher("1").find());//1 единственный ноль  будет или не будет
        System.out.println(Pattern.compile("10*").matcher("10").find());//или нет или множество 0
        System.out.println(Pattern.compile("10+").matcher("1").find());//1 или больше раз


    }
}
