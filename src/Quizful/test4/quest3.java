package Quizful.test4;
/**out ->2
 * т.к. только инкримент увеличит значение перемнной на 1
* */
public class quest3 {
    public static void main(String[] args) {
        int i=1;
        add(i++);
        System.out.println(i);
    }

    private static void add(int i) {
        i+=2;
    }
}
