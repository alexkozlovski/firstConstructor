package exams.LeetCode.task3_LongestUniqueSubstring.newaWORK;

import java.util.ArrayList;

public class CharSequence {
    private String uniqueChars;
    private int start;
    private int end;
    private static ArrayList<CharSequence> list=new ArrayList<>();

    public CharSequence(String uniqueChars, int start, int end) {
        this.uniqueChars = uniqueChars;
        this.start = start;
        this.end = end;
    }

    public String getUniqueChars() {
        return uniqueChars;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
    public static boolean contain(String text,char ch){
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i)==ch)return true;
        }
        return false;
    }
    public static void add(CharSequence charSequence){
        list.add(charSequence);
    }
    public CharSequence getMaxSequence(){
        int maxLength=0;
        CharSequence charSequence=null;
        for (CharSequence sequence: list){
            if(sequence.end-sequence.start>maxLength){
                charSequence=sequence;
            }
        }
        return charSequence;
    }
}
