package exams.CodeWars.RowSumTwoOddNumbers;

/**
 * Created by user on 08.09.2018.
 */
public class check {
    public static void main(String[] args) {
        System.out.println(check.rowSumOddNumbers(4));
    }
    public static int rowSumOddNumbers(int n) {
        long sum=0, max=n*n+n-1;
        int count=n;
        for (int i =(int) max; i <=max; i--) {
            if(count==0)break;
            else if(i%2==1){
                sum+=i;
                count--;
            }
        }
        return (int)sum;

    }
}
