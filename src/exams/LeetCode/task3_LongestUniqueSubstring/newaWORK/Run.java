package exams.LeetCode.task3_LongestUniqueSubstring.newaWORK;

public class Run {
    public static void main(String[] args) {
        String text = "aaaasderhtdffggplmnxcvgh";
        int flag = 0;
        StringBuilder currString = new StringBuilder().append(text.charAt(0));

        for (int i = 1; i < text.length(); i++) {
            if (currString.toString().matches("(.*)" + text.charAt(i) + "(.*)")) {
                CharSequence.add(new CharSequence(currString.toString(), flag, flag == 0 ? 0 : i - 1));
            }
        }
/*  String ex=String.valueOf("dsa");
        System.out.println(ex.matches("(.*)d(.*)"));
    }*/
    }
}
