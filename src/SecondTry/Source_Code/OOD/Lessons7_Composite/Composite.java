package SecondTry.Source_Code.OOD.Lessons7_Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 13.10.2018.
 */
public class Composite implements Component {
    List<Component> composite=new ArrayList<>();
    public void add(Component component){
        composite.add(component);
    }
    public void add(Component... component){
        composite.addAll(Arrays.asList(component));
    }
    @Override
    public void show() {
        for(Component component: composite){
            component.show();
        }
    }
}
