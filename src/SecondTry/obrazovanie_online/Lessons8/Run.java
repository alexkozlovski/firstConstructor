package SecondTry.obrazovanie_online.Lessons8;

public class Run {
    public static void main(String[] args) {
        MyClass myClass=new MyClass(3);
        int res=myClass.pow();
        System.out.println(res);
        System.out.println(myClass.pow());
        int[] ar=new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=(int)Math.round(Math.random()*10);
            System.out.print(ar[i]+"    ");
        }
        System.out.println();
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(myClass.pow(ar[i])+"   ");
        }

    }
}
