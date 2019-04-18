package SecondTry.Source_Code.OOD.Lessons7_Composite;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) {

        Tree tree=new Tree();
        Stick stick=new Stick();
        Leaf leaf=new Leaf();
        Composite composite=new Composite();
        /*composite.add(tree);
        composite.add(leaf);
        composite.add(stick);*/
        composite.add(tree,stick,leaf);
        composite.show();
    }
}
