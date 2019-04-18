package Quizful.test3;

public class quest10 {
    public static void main(String[] args) {
        bigloop:
        for (int i = 0; i < 3; i++) {
            try {
                {
                    for (int j = 0; j < 3; j++) {
                        if (i == j) continue;
                        else if (i > j) continue bigloop;
                        System.out.println("A");
                    }
                }
            } finally {
                System.out.println("B");
            }
            System.out.println("C");
        }
    }
}
