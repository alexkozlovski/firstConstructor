package SecondTry.Source_Code.OOD.Lessons8_Decorator.TryIt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 13.10.2018.
 */
public class Query {
    private List ingredients=new ArrayList();

    public void getInfo(){
        System.out.println("Time to build some pizza!");
        //Thread.sleep(1000);

        System.out.println("Use space or comma to separate the ingredients. Ingredients can be repeated,\nbut not more than three times.");
        // Thread.sleep(1000);
        System.out.println("Example: 1,1,2,3");
        //Thread.sleep(1000);
        System.out.println("Choice PizzaPrototype-ingredients:");
        System.out.println("1-sausages,2-bacon, 3-mushrooms");
    }
    public String processQuery(){
        Scanner sc=new Scanner(System.in);
        String enteredStr=sc.nextLine();
        enteredStr=enteredStr.trim().replaceAll("^\\p{Punct}*\\p{Alpha}*\\p{LC}","");
        enteredStr=enteredStr.replaceAll("\\p{Punct}+\\s{2,}+}"," ");
        enteredStr=enteredStr.replaceAll("\\s{2,}"," ");
        enteredStr=enteredStr.replaceAll("[3,]","");
        return enteredStr;
    }
}
