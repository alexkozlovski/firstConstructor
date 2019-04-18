package SecondTry.Source_Code.OOD.Lessons7_Composite.MorningTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 02.11.2018.
 */
public class Composite implements Component {
    private List<Component> composite=new ArrayList<>();
    @Override
    public void show() {
        for (Component component : composite) {
            component.show();
        }
    }
        public void addComponent(Component component){
            composite.add(component);
    }
    public void addAllComponents(Component... component){
        composite.addAll(Arrays.asList(component));
    }
    public void removeComponent(Component component){
        composite.remove(component);
    }
    public void removeAllComponents(Component... components){
        composite.removeAll(Arrays.asList(components));
    }
    }

