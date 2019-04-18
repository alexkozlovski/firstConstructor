package Quizful;

public class gogo extends gogogo{
    public static void main(String[] args) {
        new gogo();
        System.out.println(gogogo.j);
        int[] ints=new int[25];
        System.out.println(ints.length);

        int k=2;
        System.out.println(k<<3>>k==k>>1<<k);
        System.out.println(args.length);
        System.out.println("_____________");
        Boolean b=Boolean.valueOf("true");
        int i=10;
        String string="Hello World";
        assert (b==false):"true";
        assert(i!=10):false;
        System.out.println(string);
        Thread.currentThread().notify();
}
}
class gogogo{
    public static int j=90;
    gogogo(){
        j=12;
    }
}