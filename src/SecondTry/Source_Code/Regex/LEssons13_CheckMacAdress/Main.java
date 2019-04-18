package SecondTry.Source_Code.Regex.LEssons13_CheckMacAdress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        //mac-adress 6 групп из 16-тиричных которые принято разделять двоеточием или тире
        int counter=0;
        String MAC="77-a3-d2-01-ff-63";
//        Pattern pattern=Pattern.compile("^(((\\p{XDigit}{2})[:-]){5})\\p{XDigit}{2}$");
        Pattern pattern=Pattern.compile("^((\\p{XDigit}{2}([:-]|$)){6})$");
        //6 групп 16-ти ричных чисел которые разделяются двоеточием или тире
        Matcher matcher=pattern.matcher(MAC);
        if (matcher.find()){
            System.out.println("MAC-adress is correct"+(++counter)+" norm");
        }else{
            System.out.println("MAC-adress is incorrect");
        }




    }
}
