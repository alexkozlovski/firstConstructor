package SecondTry.obrazovanie_online.Lessons25;

import java.util.Iterator;
import java.util.Stack;

public class RunStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push((i+1)*2);
        }
        for (Integer i:
             stack) {
            System.out.print(i+"    ");
        }
        System.out.println("\n================================");
        Iterator it=stack.iterator();
        while(it.hasNext()) System.out.print(it.next()+"    ");
        System.out.println("\n================================");
/*        for (int i = 0; i <stack.size() ; i++) {
            System.out.println(stack.pop());
        }*/
int a=stack.pop();
        System.out.println(a);
        a=stack.pop();
        System.out.println(a);
        a=stack.pop();
        System.out.println(a);
        a=stack.pop();
        System.out.println(a);
        a=stack.pop();
        System.out.println(a);
        a=stack.pop();
        System.out.println(a);
        a=stack.pop();
        System.out.println(a);a=stack.pop();
        System.out.println(a);a=stack.pop();
        System.out.println(a);a=stack.pop();
        System.out.println(a);





    }
}
