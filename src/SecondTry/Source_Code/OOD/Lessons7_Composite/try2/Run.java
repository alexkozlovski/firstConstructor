package SecondTry.Source_Code.OOD.Lessons7_Composite.try2;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Component branch=new Branch();
        Component leaf=new Leaf();
        Component tree=new Tree();
        Composite composite=new Composite();
        composite.add(branch,leaf,tree);
        composite.show();
    }
}
