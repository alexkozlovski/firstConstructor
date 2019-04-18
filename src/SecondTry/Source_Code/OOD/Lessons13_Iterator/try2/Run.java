package SecondTry.Source_Code.OOD.Lessons13_Iterator.try2;

import java.util.Iterator;
public class Run {
    public static void main(String[] args) {
        DB db=new DB();
        db.add("as");
        db.add("asd");
        db.add("asdf");
        db.add("asdfgh");
        Iterator iterator=db.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

    }
}
