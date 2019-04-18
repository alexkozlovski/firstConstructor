package SecondTry.Source_Code.OOD.Lessons7_Composite.tryYourSelf_NaGit;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Component leaf=new Leaf();
        Component tree=new Tree();
        Component branch=new Branch();
        Composite composite=new Composite();

        composite.add(leaf,branch,tree);
        composite.show();
    }
}
