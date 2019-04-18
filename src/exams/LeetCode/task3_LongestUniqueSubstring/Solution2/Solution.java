package exams.LeetCode.task3_LongestUniqueSubstring.Solution2;

public class Solution {
    public int lengthOftheLongestSubstring(String s){
        String text=String.valueOf(s);
        if(text.length()==1)return 1;
        else if(text.isEmpty())return 0;

        String result=String.valueOf("");
        String curString=String.valueOf("");
        for (int i = 0; i < text.length()-1; i++) {

            if(!curString.contains(String.valueOf(text.charAt(i)))){
                curString=String.valueOf(curString+text.charAt(i));

            }else {
                i-=curString.length()-2;

                if(curString.length()>result.length()){
                    result=String.valueOf(curString);
                }else curString=String.valueOf("");
            }

        }
        return result.length()>curString.length()?result.length():curString.length();
    }
}
