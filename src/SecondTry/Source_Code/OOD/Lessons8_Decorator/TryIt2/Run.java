package SecondTry.Source_Code.OOD.Lessons8_Decorator.TryIt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    //счас бы на сушке писать программы, которые создают пиццу...
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Time to build some pizza!");
        //Thread.sleep(1000);
        System.out.println("Use space or comma to separate the ingredients. Ingredients can be repeated,\nbut not more than three times.");
       // Thread.sleep(1000);
        System.out.println("Example: 1,1,2,3");
        //Thread.sleep(1000);
        System.out.println("Choice PizzaPrototype-ingredients:");
        System.out.println("1-sausages,2-bacon, 3-mushrooms");
        Scanner sc=new Scanner(System.in);
        String enteredStr=sc.nextLine();
        enteredStr =enteredStr.trim().replaceAll("^\\p{Punct}*\\p{Alpha}*\\p{LC}","");
        enteredStr=enteredStr.replaceAll("\\s{2,}+}"," ");
        System.out.println(enteredStr);
        List ingredients=new ArrayList();
        Pattern pattern=Pattern.compile("[1-"+3+"]");
        Matcher matcher=pattern.matcher(enteredStr);
        while (matcher.find()){
            ingredients.add(Integer.parseInt(matcher.group().trim()));
            System.out.println(matcher.group());
        }
        System.out.println(ingredients);
/*            Query query=new Query();
            query.getInfo();
            query.processQuery();*/

    }
}
