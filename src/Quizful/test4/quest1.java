package Quizful.test4;
/**break на отметке i>2 выполнится внутренний цикл 3 раза 0!>2,1!>2,2!>2.
 * */
public class quest1 {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                if(j==0) System.out.print("i-"+i+":");
                if(i>2)break label;
                System.out.print(j);
            }
            System.out.print(" ");
        }
    }
}
