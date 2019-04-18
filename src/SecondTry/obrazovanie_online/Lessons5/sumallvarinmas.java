package SecondTry.obrazovanie_online.Lessons5;

public class sumallvarinmas {
    public static void main(String[] args) {
        int masSum=0;
        int[] mas=new int[3];
        for (int i = 0; i <mas.length ; i++) {
            mas[i]=(int)Math.round(Math.random()*10);
            System.out.printf("%3d",mas[i]);
            masSum+=mas[i];
        }
        System.out.println("\n"+masSum);

    }
}
