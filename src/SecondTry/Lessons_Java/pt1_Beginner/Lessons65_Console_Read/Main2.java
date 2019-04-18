package SecondTry.Lessons_Java.pt1_Beginner.Lessons65_Console_Read;

import java.util.Scanner;

/**
 * Created by user on 15.09.2018.
 */
public class Main2 {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            if(s.equals("exit")){
                System.out.println("exitttttt and break");
                break;
            }
            System.out.println(s);
        }
    }
}
