package exams.Tests.MainMethod;

public class Quest {
    public static void main() {
        System.out.println("A");
    }

    public static void main(String args) {
        System.out.println("B");
    }
    public static void main(String[] args) {
        System.out.println("C");
        main("");
        main();
    }
}
