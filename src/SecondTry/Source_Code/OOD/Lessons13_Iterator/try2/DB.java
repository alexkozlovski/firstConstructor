package SecondTry.Source_Code.OOD.Lessons13_Iterator.try2;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 05.11.2018.
 */
public class DB implements Container{
    int index;
   private List<String> list=new ArrayList<>();
    public void add(String s){
        list.add(s);
    }
    public Iterator iterator(){

        return list.iterator();
    }
    public boolean hasNext(){
        return index<list.size();
    }
    public Object next(){
        if (this.hasNext())return list.get(index);
        return null;
    }

    @Override
    public Iterator getIterator() {
        return list.iterator();
    }
}
