package SecondTry.Source_Code.OOD.Lessons13_Iterator;

/**
 * Created by user on 05.11.2018.
 */
public class Database implements Container {
    private String[] content={"Roger Stewart. Web-designer",
            "Andrew Scott. Android developer","Nicolas Smith. iOS developer"};
    @Override
    public Iterator getIterator() {
        return new DatabaseIterator();
    }
    private class DatabaseIterator implements Iterator{
        private int index;
        @Override
        public boolean hasNext() {
            return index<content.length;
        }
        @Override
        public Object next() {
            if(this.hasNext())return content[index++];
            return null;
        }
    }
}
