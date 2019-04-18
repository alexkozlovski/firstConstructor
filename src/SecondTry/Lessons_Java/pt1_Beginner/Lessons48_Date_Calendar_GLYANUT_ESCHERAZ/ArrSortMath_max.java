package SecondTry.Lessons_Java.pt1_Beginner.Lessons48_Date_Calendar_GLYANUT_ESCHERAZ;

public class ArrSortMath_max {
    public static void main(String[] args) {
        int[] ar=new int[20];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=(int)Math.round(Math.random()*100);
            System.out.print(ar[i]+"    ");
        }
        ar[ar.length-1]=1;
        System.out.println();
        for (int i = 0; i < ar.length; i++) {

            System.out.print(ar[i]+"    ");
        }
        for (int j = 0; j < ar.length-1; j++) {
            for (int i = 0; i <ar.length-1 ; i++) {

                int ai=ar[i];
                int ai2=ar[i+1];
                if(ai>ai2){
                ar[i+1]=Math.max(ai,ai2);
                ar[i]=Math.min(ai,ai2);}
            }
        }

        System.out.println();
        for (int i = 0; i < ar.length; i++) {

            System.out.print(ar[i]+"    ");
        }
    }
}
