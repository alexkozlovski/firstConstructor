package SecondTry.obrazovanie_online.Lessons25;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();
/*        stack.push("da");
        stack.push(23);
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int i = stack.size()-1; i >=0; i--) {
            System.out.println(stack.get(i));
        }*/
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        while(stack.size()>0) System.out.println(stack.pop());

    }

}