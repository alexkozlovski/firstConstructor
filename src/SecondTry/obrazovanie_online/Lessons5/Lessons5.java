package SecondTry.obrazovanie_online.Lessons5;

public class Lessons5 {
    public static void main(String[] args) {
/*        int[]mas=new int[2];
        mas[0]=1;
        mas[1]=3;

        int a = mas[1];
        System.out.println(a);

        for (int i = 0; i <=0 ; i++) {
            System.out.println(mas[i]);
        }*/
int n =10;
int []mas=new int[n];
        for (int i = 0; i <n ; i++) mas[i]=i*i;
        for (int i = 0; i <n ; i++) System.out.printf("%4d",i);
        System.out.println("\nasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasd");

/*        int[][] mas1=new int[4][4];
        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas.length; j++) {
                mas1[i][j]= (int) Math.round(Math.random());
            }
        }
        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas.length; j++) {
                System.out.printf("%3d",mas1[i][j]);
            }
            System.out.println();
        }*/
int[] ar=new int[4];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=(int)Math.round(Math.random()*100);
            System.out.printf("%3d",ar[i]);
        }
        int minarvar=0;
        for (int i = 0; i < ar.length; i++) {
            minarvar=ar[i];
            for (int j = 1; j < ar.length; j++) {
                if(minarvar>ar[j])minarvar=ar[j];
            }
        }
        System.out.println("\n"+minarvar);


    }

}
