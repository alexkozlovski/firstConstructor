package SecondTry.obrazovanie_online.Lessons4;

public class Lessons4 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            if(i==6) break;
        }


        System.out.println("asdasdsa");
        for (int i = 0; i <10 ; i++) {
            if((i%2)==0)continue;
            double d=i*i+0.1;
            System.out.println((int)d);
        }
    }
}
