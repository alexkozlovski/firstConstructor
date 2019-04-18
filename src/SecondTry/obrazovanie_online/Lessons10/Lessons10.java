package SecondTry.obrazovanie_online.Lessons10;

public class Lessons10 {
    public static String pow(int a){
        return "celoe";
    }
    public static String pow(double a){
        return "dro6noe";
    }
    public static String pow(String s){
        return "vasche stroka";
    }
    public static String po(int... a){
        int min = 0;
        int max = 0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max)max=a[i];
            if(a[i]<min)min=a[i];
            if(a.length==i-1) System.out.println(" min"+min+" max"+max);

        }
        return " min"+min+" max"+max;


    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            StringBuilder stringBuilder=new StringBuilder("asd");
            if(i%2==0) System.out.println(pow(i));
            else if(i%3==0) System.out.println(pow(2.2*i));

            else System.out.println(stringBuilder.append(i));
        }
        System.out.println(po(1,2,14,20,13,20,13,12,13,-11112,14,-10,100,-1000,1000,2,3,-1111,1000));
    }
}
