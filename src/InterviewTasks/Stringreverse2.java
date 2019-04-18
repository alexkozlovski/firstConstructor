package InterviewTasks;

public class Stringreverse2 {
    public static String reverseString(String original, int startpos, int endpos) {
        char[] charsOfOriginal = original.toCharArray();
        if (original == null || original.length() <= 1 || startpos >= endpos) return original;
        charsOfOriginal[startpos] ^= charsOfOriginal[endpos] ^ (charsOfOriginal[endpos] = charsOfOriginal[startpos]);
        return reverseString(String.valueOf(charsOfOriginal), ++startpos, --endpos);


    }

    public static String reverseString2(String original, int startpos, int endpos) {
        if (original == null || original.length() <= 1 || startpos >= endpos) return original;
        char[] charsOfOriginal = original.toCharArray();
        charsOfOriginal[startpos] ^= charsOfOriginal[endpos] ^ (charsOfOriginal[endpos] = charsOfOriginal[startpos]);
        return startpos >= endpos ?
                String.valueOf(charsOfOriginal) :
                reverseString2(String.valueOf(charsOfOriginal), ++startpos, --endpos);
    }
    public static String reverseString(String original){
        if(original==null||original.length()<10)return original;
        char[] charsOfOriginal=original.toCharArray();

        return String.valueOf("");
    }

    public static void main(String[] args) {
        String str = String.valueOf("Hello");
        System.out.println(reverseString(str, 0, str.length() - 1));
        System.out.println(reverseString2(str,0,str.length()-1));
    }
}
