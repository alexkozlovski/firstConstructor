package InterviewTasks;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(reverseString("hello World)"));
        System.out.println(reverseString(")dlroW olleh"));
    }
    static String reverseString(String original){
        char[] chars=original.toCharArray();
        for (int i = 0,j=chars.length-1; i<j ; i++,j--) {
            System.out.println(chars[i]+" "+chars[j]);
            chars[i]^=chars[j]^(chars[j]=chars[i]);
            System.out.println(chars[i]+" "+chars[j]);
        }
        return String.valueOf(chars);
    }
}
