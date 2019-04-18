package SecondTry.Lessons_Java.pt1_Beginner.Lessons53_Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        Set<Integer> queue2 = new TreeSet<Integer>();
        //Queue queue = new PriorityQueue();
        Stack stack=new Stack();
        stack.add(4);
        stack.add(1);
        stack.add(3);
       // System.out.println(stack.peek());
        queue.add(1);
        queue.add(3);
        queue.add(2);
        //System.out.println(queue.peek());
        List list=(List)queue;
        Collections.sort(list);
        System.out.println(list);
        // System.out.println(queue.size());
/*        while(queue.size()>0) System.out.println(queue.poll());
    }*/

    }
}
/*class MyComporator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.valueOf(o1)-Integer.valueOf(o2);
    }*/
//}
