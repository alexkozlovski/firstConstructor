package exams.Tests.Autoboxing;

public class Test {
    public static void main(String[] args) {
        //var(2,new Integer(2));
        byte[] a={49,50,51,52,53,54,55};
        String b=new String(a);
        System.out.println(b);
        String c=new String(a,2,4);
        System.out.println(c);
        Integer i=129;
        Integer i2=129;
        System.out.println(i==i2);
    }
    public static void var(Integer... i){
        System.out.println("integer...");
    }
    public static void var(int... i){
        System.out.println("int...");
    }
    public static void var(Integer i, int a){
        System.out.println("integer and int");
    }
}
