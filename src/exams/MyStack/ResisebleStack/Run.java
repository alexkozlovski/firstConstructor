package exams.MyStack.ResisebleStack;



import java.util.Iterator;
import java.util.Random;

public class Run {
    private static int[] array=new int[5];
    public static void main(String[] args) {
       Stack stack=new Stack(2);
        int count=0;
        for (int i = 0; i <50 ; i++) {
            stack.push(new Random(System.nanoTime()).nextInt(6)+5);
            System.out.println(i+"  :=  "+stack.pick());
            count++;
        }
        System.out.println("\n"+count);
/*        add(1,2,3,4,5,2);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }*/
        Iterator iterator=stack.iterator();
        while (iterator.hasNext()){
            System.out.printf("[%d] ",iterator.next());
        }
    }

}
