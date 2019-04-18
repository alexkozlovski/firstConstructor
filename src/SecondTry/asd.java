package SecondTry;


import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by user on 03.10.2018.
 */
public class asd {
    public static void main(String[] args) {
        /*String pas="1234";
        str.chars()
                .mapToObj(x->(char)x)
                .foreach(System.out::println);*/
        String str="123";
        IntStream intStream=str.chars();
        intStream.forEach(x->System.out.println((char)x));
        System.out.println(Arrays.toString( str.codePoints().toArray()));
        char[] ch;
        int count=0;
        ch=new char[str.codePoints().toArray().length];
        for (int i:str.codePoints().toArray()){
            ch[count++]=(char) i;
        }
        System.out.println(Arrays.toString(ch));
    }
}
