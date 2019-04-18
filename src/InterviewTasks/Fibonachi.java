package InterviewTasks;

import java.util.Arrays;


public class Fibonachi {
    public static void main(String[] args) {
        fibonachi(10);
        System.out.println();
        fibonachi2(15);
    }
    public static void fibonachi(int number){
        int fibo=0,fibo2=1,fibonachi;
        for (int i = 0; i <number ; i++) {
            fibonachi=fibo+fibo2;
            fibo=fibo2;
            fibo2=fibonachi;
            System.out.printf("%d ",fibonachi);
        }
    }
    public static void fibonachi2(int number){
        if(number<=2)return;
        int[] cache=new int[number+2];
        number+=1;
        for (int i = 0; i <number ;) {
            if (i==0){
                cache[i]=i;
                cache[++i]=i;
            }
            cache[++i]=cache[i-1]+cache[i-2];
        }
        System.out.println(Arrays.toString(cache));
    }
}
