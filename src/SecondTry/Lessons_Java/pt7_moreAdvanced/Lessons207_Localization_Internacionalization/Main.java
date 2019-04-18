package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons207_Localization_Internacionalization;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user on 24.09.2018.
 */
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ResourceBundle bundleDefault=ResourceBundle.getBundle("SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons207_Localization_Internacionalization.resources");
        ResourceBundle bundleEn=ResourceBundle.getBundle("SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons207_Localization_Internacionalization.resources",new Locale("en","US"));
        ResourceBundle bundleDe=ResourceBundle.getBundle("SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons207_Localization_Internacionalization.resources",new Locale("de","GR"));
        ResourceBundle bundleRu=ResourceBundle.getBundle("SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons207_Localization_Internacionalization.resources",new Locale("ru","RU"));

        System.out.println("def "+bundleDefault.getString("somevalue"));
        System.out.println("EN  "+new String(bundleEn.getString("somevalue").getBytes("ISO-8859-1"),"UTF-8"));
        System.out.println("DE  "+bundleDe.getString("somevalue"));
        System.out.println("RU  "+bundleRu.getString("somevalue"));
    }
}
