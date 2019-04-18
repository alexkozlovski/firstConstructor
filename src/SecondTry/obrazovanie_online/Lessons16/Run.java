package SecondTry.obrazovanie_online.Lessons16;

public class Run  {
    public static void main(String[] args)  {
        //int      - Integer
        //char     - character
        //double   - Double
        //boolean  - Boolean
        //long     - Long
        String str="5";
        int a=Integer.parseInt(str);
        int b=Integer.valueOf(str);
        int c=Integer.decode(str);
        System.out.println(a+" "+b+" "+c);
        String str2=str+a+"asdfghl";
        char[] chars=str2.toCharArray();
        for (char e:
                chars) {
            System.out.print(e+"    ");
        }
        System.out.println(Math.sqrt(9));


    }
}
