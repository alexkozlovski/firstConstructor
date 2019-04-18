package SecondTry.obrazovanie_online.Lessons24;

import java.util.LinkedList;
import java.util.Queue;

public class Run2Queue {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.offer(23);
        que.offer(33);
        que.offer(43);
        que.offer(53);
        while(que.size()>0) System.out.println(que.poll());


    }
}
