package SecondTry.obrazovanie_online.Lessons2;

public class lesons2 {
    public static void main(String[] args) {
        int n=12;
        System.out.println( (n&1) ==0 ? "even":"odd");
        boolean b=(n%2)==0;
        System.out.println(b);
        if(n%2==0){
            System.out.println("заебок");
        }


        switch (10){
            case 1:
                System.out.println("one"); break;
            case 2:
                System.out.println("two"); break;
            case 101:
                System.out.println("ten"); break;
            default:
                System.out.println("undefined");
        }

        int x=2,z=4;
        char c='*';
        int res=(int)Double.POSITIVE_INFINITY;
        switch (c){
            case '+': res=x+z;break;
            case '-':res=x-z;break;
            case '*':res=x*z;break;
            default:
                System.out.println("undefined");
        }
        System.out.println(res);
    }





    }

