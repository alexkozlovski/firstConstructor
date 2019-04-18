package SecondTry.obrazovanie_online.Lessons8;

public class SUMfrom1to100 {
    public static void main(String[] args) {
        int res=0;
        for (int i = 1; i <=100; i++) {
            res+=i;
        }
        System.out.println(res);
        String s=new String("asdasdasd");
        System.out.println(s);
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.append(23);
        System.out.println(stringBuilder);
        s=stringBuilder.toString();
        System.out.println(s);
        boolean b=s.contains("23");
        System.out.println(b);
    }
}
