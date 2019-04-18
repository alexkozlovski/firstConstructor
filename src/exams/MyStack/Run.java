package exams.MyStack;


import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Stack stack=new Stack(20);
        int count=0;
        for (int i = 0; i <stack.getSize() ; i++) {
            stack.push(new Random(System.nanoTime()).nextInt(6)+5);
            System.out.print(stack.pick()+" ");
            count++;
        }
        System.out.println("\n"+count);
/*        for (int i = 0; i <stack.getSize() ; i++) {
            System.out.print(stack.pop()+" ");
        }*/
        System.out.println(stack.getLast());
    }
}
