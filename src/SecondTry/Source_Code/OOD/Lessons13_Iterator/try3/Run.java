package SecondTry.Source_Code.OOD.Lessons13_Iterator.try3;

/**
 * Created by user on 05.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        MyDB myDB=new MyDB();
        Iterator iterator=myDB.getIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
