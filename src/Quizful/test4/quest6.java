package Quizful.test4;

public class quest6 {
    public static void main(String[] args) {
        int x=1;
        Integer y=1;
        int[] z={x};
        func(x,y,z);
        System.out.println(x+"  "+y+"   "+z[0]);
    }

    private static void func(int x, Integer y, int[] z) {
        x++;
        y++;
        z[0]++;
    }
}
