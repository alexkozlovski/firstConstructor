package exams.LeetCode.task3_LongestUniqueSubstring.SOlution4;

public class Solut {
    public int lengthOfLongestSubstring(String s){
        if(s.length()==0||s==null)return 0;
        else if(s.length()==1)return 1;
        int maxLength=1;
        String text=String.valueOf(s);
        StringBuilder subString=new StringBuilder(text.charAt(0));
        for (int i = 1; i <text.length() ; i++) {
            if(!subString.toString().contains(String.valueOf(text.charAt(i)))){
                subString.append(text.charAt(i));
                if(maxLength<subString.length())maxLength=subString.length();
            }else {

            }
        }
        return maxLength;
    }
}
