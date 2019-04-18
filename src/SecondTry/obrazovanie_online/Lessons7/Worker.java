package SecondTry.obrazovanie_online.Lessons7;

import java.util.HashSet;
import java.util.Set;

public class Worker {
    int age;

    public Worker(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Set<Worker> team=new HashSet<Worker>();
        team.add(new Worker(2));
        team.add(new Worker(3));
        team.add(new Worker(4));
        team.add(new Worker(5));
        team.add(new Worker(26));
        two two=new two();
        two=null;
        System.gc();
        new nene();
        String sss=null;
        System.out.println(null+sss);
        System.out.println(sss+null);
        System.out.println((String)null);
        System.out.println("__________________");
        String prog= "prog";
        StringBuffer prog1=new StringBuffer("prog");
        StringBuffer prog2=new StringBuffer("prog");
        System.out.println(prog.equals(prog1));
        System.out.println(prog1.equals(prog));
        System.out.println(prog1.equals(prog2));
        Double d=13.0;
        Double d2=d.valueOf(d);
        Double d3=d.doubleValue();
        System.out.println(d==d2);
        System.out.println(d==d3);

        System.out.println(orr());
    }
    static long orr(){
        return (1==1)?null:1L;
    }
}
class one{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("one");
    }
}
class two extends one{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("two");
        super.finalize();
    }
}
class gogo{
    gogo(){
        System.out.println("gogoo");
    }
}
class nene extends gogo{
    public nene() {
        System.out.println("nene");
    }
}