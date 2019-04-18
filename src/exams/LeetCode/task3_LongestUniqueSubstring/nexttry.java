package exams.LeetCode.task3_LongestUniqueSubstring;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nexttry {
    public static void main(String[] args) {
        String s = "aaasadafghggsdfgharrrrrr";
        ArrayList<StringBuilder> strings = new ArrayList<>();
        System.out.println(strings.size());
        strings.add(new StringBuilder());
        System.out.println(strings.size());

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (strings.isEmpty()) {
                for (int k = i; k < s.length()-1; k++) {
                    System.out.println("cycle k"+k+"    "+s.charAt(k));
                    if (s.charAt(k) != s.charAt(k + 1)) {
                        strings.add(new StringBuilder(String.valueOf(s.charAt(k))));
                        i = k;
                    }
                }
                break;
            }
            if (strings.get(i).length() != 0 && strings.get(i).toString().matches(String.valueOf(strings.get(i)))) {
                strings.add(new StringBuilder(String.valueOf(s.charAt(i))));
                j++;
                break;
            } else if (!strings.get(i).toString().matches(String.valueOf(strings.get(i)))) {
                strings.set(j, strings.get(j).append(s.charAt(i)));
            }
        }
        strings.forEach(System.out::println);
    }
}
