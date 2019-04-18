package SecondTry.obrazovanie_online.Lessons18;

public class Collection {
    private  Object []arr;
    public Collection(Object []arr){
        this.arr=arr;
    }
    public  class  Forward implements Iterator{
        private int cur=0;
        @Override
        public boolean HasNext() {

            return cur<arr.length;
        }

        @Override
        public Object next() {
            return arr[cur++];
        }
    }
    public  class BackWard implements Iterator{
        private int cur=arr.length-1;
        @Override
        public boolean HasNext() {
            return cur>=0;
        }

        @Override
        public Object next() {
            return arr[cur--];
        }
    }
/*    public static class FabrClas{
        public static Iterator createForward(){
            return new Forward();
        }
        public static  Iterator createBackForward(){
            return new BackWard();
        }

    }*/
public Iterator createIterator(){
    return new Iterator() {
        int cur=-1;
        @Override
        public boolean HasNext() {
            return cur<arr.length-2;
        }

        @Override
        public Object next() {
            cur+=2;
            return arr[cur];
        }
    };
}
    public  Iterator createForward(){
        return new Forward();
    }
    public   Iterator createBackForward(){
        return new BackWard();
    }


}
