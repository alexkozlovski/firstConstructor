package Quizful.test1;

public class Question20 {
    public static void main(String[] args) {
        //answer: 6
        int count = 1, i = 0;
        do {
            count *= ++i;
            if (count > 5) break;
        } while (i <= 4);
        System.out.println(count);
    }

    //1*1=1(<=4)
    //1*2=2(<=4)
    //2*3=6(>4)
}
