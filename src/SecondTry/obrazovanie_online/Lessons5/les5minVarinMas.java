package SecondTry.obrazovanie_online.Lessons5;


public class les5minVarinMas {
    public static void main(String[] args) {
        int[] mas=new int[5];
        for (int i = 0; i <mas.length ; i++) {
            mas[i]=(int)Math.round(Math.random()*100);
            System.out.print(mas[i]+" ");
        }System.out.println();

        int masmin=0;
        for (int i = 1; i <mas.length ; i++) {
            if(mas[0]>mas[i])masmin=mas[i];
        }
        System.out.println(masmin);

    }
}
