package SecondTry.Lessons_Java.pt4_Advanced.Lessons148_prefernces;

import SecondTry.Lessons_Java.pt4_Advanced.Lessons147_properties.Propertya_Main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * Created by user on 17.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Preferences root=Preferences.systemRoot();
        Preferences user=Preferences.userRoot();
        user.put("keay","value");
        System.out.println(user.get("keay","default"));
        Preferences node=user.node("myPackage");
        node.put("one","1");
        System.out.println(node.getInt("one",2));
        Preferences myPackage=Preferences.userNodeForPackage(Propertya_Main.class);
        try {
            user.exportSubtree(new FileOutputStream("myproperties.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }
}
