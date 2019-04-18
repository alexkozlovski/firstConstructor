package SecondTry.obrazovanie_online.Lessons8;

public class Go {
    public static void main(String[] args) {
        NewClass[] ar=new NewClass[10];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=new NewClass((int)Math.round(Math.random()*10));
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i].getA()+"    ");

        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i].getA()*ar[i].getA()+"    ");

        }
        int[][] arr=new int[10][];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=new int[10];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=(int)Math.round(Math.random()*1000);
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println("\n");
        }

    }
}
