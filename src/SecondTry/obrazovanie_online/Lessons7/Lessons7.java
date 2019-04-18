package SecondTry.obrazovanie_online.Lessons7;

public class Lessons7 {

    public static void main(String[] args) {
        long fibo1=0,fibo2=1,fibonachi=0;
        for (int i = 0; i <10 ; i++) {
            fibonachi=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonachi;
            System.out.print(fibonachi+" ");
        }
        System.out.println("\n"+fibonachi);
        int[] ar=new int[5];
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            ar[i]=(int)Math.round(Math.random()*10);
            sum+=ar[i];
            if(i==ar.length-1){
                for (int j = 0; j <ar.length ; j++) {
                    System.out.printf("%3d",ar[j]);

                }
            }
        }
        System.out.println("\nsred "+(double)Math.round(sum/ar.length)+" sum  vseh "+sum);



        int krat5=0;
        int[] ar1=new int[27];
        for (int i = 0; i <ar1.length ; i++) {
            ar1[i]=(int)Math.round(Math.random()*1000);
            System.out.print(ar1[i]+"   ");
        }
        for (int i = 0; i <ar1.length ; i++) {
            if(ar1[i]%5==0) System.out.print("\n"+ar1[i]+"   ");
        }

    }
}
