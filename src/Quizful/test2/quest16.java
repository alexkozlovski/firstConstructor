package Quizful.test2;

public class quest16 {
    /**
     * 0-def
     * 1-one
     * 2-def
     * 3-three four def т.к. брика нету.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; ) {
            switch (new Integer(i++)) {
                case 1:
                    System.out.println("one "+i);
                    break;
                case 3:
                    System.out.println("three "+i);
                case 4:
                    System.out.println("four "+i);
                default:
                    System.out.println("def "+i);
            }
        }
    }
}
