package exams.LeetCode.task3_LongestUniqueSubstring.SOlution3;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        if(s.length()==0)return 0;
        else if(s.length()==1)return 1;
        //else if(s.length()==2&&s.charAt(0)!=s.charAt(1))return 2;
        String text=String.valueOf(s);
        int maxLength=0;
        System.out.println(text.length());
        for (int i = 0; i <text.length()-1; i++) {
            for (int j = i+maxLength; j <text.length()+1&&j-i>=maxLength; j++) {
                if(j-i>maxLength&&maxLength<text.substring(i,j).length()&&!text.substring(i,j).matches(".*(.).*\\1.*")){
                    maxLength=text.substring(i,j).length();
                    System.out.println(text.substring(i,j));
                    System.out.println("i="+i+", j=="+j);
                    System.out.println((Float.valueOf(100f/text.length()*j)));
//                    if(maxLength<text.substring(i,j).length()){
//                        maxLength=text.substring(i,j).length();
//                    }
                }
            }
        }
        return maxLength;
    }
}
