package exams.CodeWars.RowSumTwoOddNumbers;

public class numbSeq {
    public static void main(String[] args) {
 /*       int sum=0;
        for (int i = 0; i <=103 ; i++) {
            System.out.println(sum+"+"+i+"="+(sum+i));
            sum+=i;

        }
        //System.out.println(sum);
        System.out.println(getnum(103));*/
        System.out.println(Math.round(23.4));
        System.out.println(Math.round(23.5));
        System.out.println(Math.ceil(23.4));
        System.out.println(Math.ceil(23.6));
        System.out.println(Math.floor(23.4));
        System.out.println(Math.floor(23.5));
    }
    public static int getnum(int num){
        //return num/2*num+num;
//        return num*(num/2-1)+num/2+num;
        return (int)Math.floor(Math.pow(num,2)/2)+num;
    }
}
