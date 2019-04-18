package InterviewTasks.Mornings_try;

import java.util.ArrayList;
import java.util.List;

public class Fibonachi {
    public static List<Integer> fibo(int numb){
        ArrayList<Integer> cache=new ArrayList<>(numb+2);
        int fibo1=0;
        int fibo2=1;
        int fibo;
        {
            cache.add(fibo1);
            cache.add(fibo2);
        }
        if (numb<=0||numb<=2)return cache;
        for (int i = 0; i < numb; i++) {
            fibo=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibo;
            cache.add(fibo);
        }
        return cache;
    }
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
}
