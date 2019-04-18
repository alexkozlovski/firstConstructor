package SecondTry.Source_Code.OOD.Lessons7_Composite.try2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 13.10.2018.
 */
public class Composite implements Component {
    List<Component> componentList=new ArrayList<>();

    public void add(Component component){
        componentList.add(component);
    }
    public void add(Component... components){
        componentList.addAll(Arrays.asList(components));
    }
    @Override
    public void show() {
        for(Component component: componentList){
            component.show();
        }
    }
}
