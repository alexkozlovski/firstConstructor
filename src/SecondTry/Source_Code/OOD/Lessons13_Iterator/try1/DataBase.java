package SecondTry.Source_Code.OOD.Lessons13_Iterator.try1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 05.11.2018.
 */
public class DataBase implements Container{

    List<String> content=new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return new DataBaseIterator();
    }

    private class DataBaseIterator implements Iterator{
        private int index=0;
       // private int lastIndex=content.size();
        @Override
        public boolean hasNext() {

            return index<content.size();
        }

        @Override
        public Object next() {
            if (this.hasNext())return content.get(index++);
            return null;
        }
    }
    public void add(String s){
        content.add(s);
    }
    public void addAll(String... s){
        content.addAll(Arrays.asList(s));
    }
    public void remove(String s){
        content.remove(s);
    }
    public void removeAll(String... s){
        content.removeAll(Arrays.asList(s));
    }
}
