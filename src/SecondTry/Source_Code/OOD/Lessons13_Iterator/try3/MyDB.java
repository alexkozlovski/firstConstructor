package SecondTry.Source_Code.OOD.Lessons13_Iterator.try3;

/**
 * Created by user on 05.11.2018.
 */
public class MyDB implements Container{
    String[] content={"alex kozlovsky","Lesha shakhtorin","Nikitia tret","mama blyaha"};
    private class MyDBiterator implements Iterator{
        int index;
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
    @Override
    public Iterator getIterator() {
        return new MyDBiterator();
    }

}
