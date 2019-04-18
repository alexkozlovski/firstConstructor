package exams.Tests.SystemInRead;

import java.io.IOException;

public class Quest {
    static  String s;
    static void go(){
        System.out.println(s);
        go();
    }
    public static void main(String[] args) throws IOException {
        int[] bytes=new int[10];
/*        for (int i=0;i<bytes.length;i++){
            bytes[i]=(int)System.in.read()&255;
            System.out.printf("bytes [%d]=%d%n",i,bytes[i]);
        }
        for (int i = 0; i <bytes.length ; i++) {
            System.out.printf("%2d",bytes[i]);
        }*/
        char[] d={'h','e'};
        String s="he";
        System.out.println(d.equals(s));
        System.out.println(s=="he"+"???");
        Integer integer=new Integer("10");
        System.out.println(integer.toString().intern()==integer.toString().intern());
      /*  go();*/
        int i=new Integer("1")+new Integer("2")+Integer.valueOf("3");
        System.out.println(i);
    }
    public final static class A{}
    static private class n{
    }
    abstract static class s{}
    static final private class s2{}
}
