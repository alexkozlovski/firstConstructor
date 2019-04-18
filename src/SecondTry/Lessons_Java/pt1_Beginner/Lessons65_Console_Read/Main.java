package SecondTry.Lessons_Java.pt1_Beginner.Lessons65_Console_Read;

import java.io.Console;
//java SecondTry/Lessons_Java/Lessons65_Console_Read/MultipleInheritenceLesson
/**
 * Created by user on 14.09.2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Console console=System.console();
        String s="";
        while(!s.equals("exit")){
            s=console.readLine();
            System.out.println(s);
            //SecondTry/Lessons_Java/Lessons65_Console_Read/MultipleInheritenceLesson
        }
    }
}
