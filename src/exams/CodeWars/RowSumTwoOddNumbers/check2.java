package exams.CodeWars.RowSumTwoOddNumbers;

/**
 * Created by user on 08.09.2018.
 */
public class check2 {
    public static void main(String[] args) {
        System.out.println(check2.rowSumOddNumbers(4));
    }
    public static int rowSumOddNumbers(int n) {
        int count=n;
        int max=n*n+n-1;
        int sum=0;
        if(n==0||n==1)return n;
        while(count!=0){
            sum+=max;
            max-=2;
            count--;
        }
        return sum;
    }
}
