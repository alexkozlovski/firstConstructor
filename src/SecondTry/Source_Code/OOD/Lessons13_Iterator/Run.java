package SecondTry.Source_Code.OOD.Lessons13_Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 05.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Database database=new Database();
        Iterator iterator=database.getIterator();
        while (iterator.hasNext()){
            System.out.println("Database item: "+iterator.next());
        }
    }

}
