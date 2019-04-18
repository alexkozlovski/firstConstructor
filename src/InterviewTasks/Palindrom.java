package InterviewTasks;

public class Palindrom {
    public static boolean isPalindrom(String s){
            if(s==null||s.length()<2)return false;
        StringBuilder stringBuilder=new StringBuilder().reverse();
        return s.equals(stringBuilder.toString());
    }
    public static boolean isPalindrom(int i){
        if(i<=9)return false;
        String s=String.valueOf(i);
        StringBuilder stringBuilder=new StringBuilder(s).reverse();
        return s.equals(stringBuilder.toString());
    }
    private static boolean isAPalindrom(int number){
        if (Math.abs(number)<10)return true;
        char[] chars=String.valueOf(number).toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]!=chars[chars.length-i-1])return false;
        }
        return true;
    }
    private String reverseStr(String original){
        if(original==null||original.length()<10)return null;
        return null;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("hwewh"));
        System.out.println(isPalindrom(12321));
        System.out.println(isAPalindrom(22122));

    }
}
