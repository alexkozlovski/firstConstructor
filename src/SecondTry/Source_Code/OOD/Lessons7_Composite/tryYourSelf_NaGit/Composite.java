package SecondTry.Source_Code.OOD.Lessons7_Composite.tryYourSelf_NaGit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 13.10.2018.
 */
public class Composite implements Component {
    List<Component> compositeList=new ArrayList<>();

   public void add(Component... component){
       compositeList.addAll(Arrays.asList(component));
   }
   public void add(Component component){
       compositeList.add(component);
   }
    @Override
    public void show() {
        for (Component component: compositeList){
            component.show();
        }
    }
}
