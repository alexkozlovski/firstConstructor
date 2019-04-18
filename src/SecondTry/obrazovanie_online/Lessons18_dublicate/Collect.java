package SecondTry.obrazovanie_online.Lessons18_dublicate;

public class Collect {
    private int[] ar;
    public Collect(int[] ar){
        this.ar=ar;
    }
    public class fromForward implements Iter{
        int from=0;
        @Override
        public boolean HasNext() {
            return from<ar.length;
        }

        @Override
        public Object next() {
            return ar[from++];
        }

    }
    public class fromBackWard implements Iter{
        int from=ar.length-1;
        @Override
        public boolean HasNext() {
            return from>=0;
        }

        @Override
        public Object next() {
            return ar[from--];
        }
    }
    public Iter createFromForward(){
        return new fromForward();
    }
    public Iter createFromBackWard(){
        return new fromBackWard();
    }

}
