package SecondTry.obrazovanie_online.Stack_Realization_VERNUTSIA_POZHE_BLYA;
import java.util.Stack;
public class Run {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());
        stack.push(4);
        stack.push(6);
        stack.push(1);
        stack.push(-20);
        stack.push(13);
        System.out.println(stack);
        System.out.println(stack.add(23));
        System.out.println("========");
        stack.addElement(1);
        System.out.println("========");
        System.out.println(stack);



    }
}
