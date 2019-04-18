package SecondTry.Source_Code.OOD.Lessons7_Composite.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Component leaf=new Leaf();
        Component stick=new Stick();
        Component branch=new Branch();
        Component root=new Root();
        Composite composite=new Composite();
        composite.addAllComponents(root,branch,stick,leaf);
        composite.show();

        System.out.println("\n");
        composite.removeComponent(leaf);
        composite.show();
        System.out.println("\n");
        composite.addComponent(leaf);
        composite.show();
        System.out.println("\n");
        composite.removeAllComponents(leaf,root);
        composite.show();

    }
}
