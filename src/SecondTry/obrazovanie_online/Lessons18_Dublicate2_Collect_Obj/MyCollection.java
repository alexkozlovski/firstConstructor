package SecondTry.obrazovanie_online.Lessons18_Dublicate2_Collect_Obj;

public class MyCollection {
    Object[] ar;
    MyCollection(Object[] ar){
        this.ar=ar;
    }
    public class Forward implements MyIterator{
        public int from=0;
        @Override
        public boolean hasNext() {
            return from<ar.length;
        }

        @Override
        public Object next() {
            return ar[from++];
        }
    }
    public class BackWard implements MyIterator{
        public int from=ar.length-1;
        @Override
        public boolean hasNext() {
            return from>=0;
        }

        @Override
        public Object next() {
            return ar[from--];

        }
    }
    public MyIterator creatIterFromForward(){
        return new Forward();
    }
    public MyIterator createIterFromBackward(){
        return new BackWard();
    }
}
