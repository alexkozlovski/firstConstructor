package exams.LeetCode.task3_LongestUniqueSubstring.Solution;

public class Solution {
    public int lengthOftheLongestSubstring(String s){
        String text=String.valueOf(s);
        StringBuilder resultString=new StringBuilder();
        StringBuilder currString=new StringBuilder();
        if(text.length()==1)return 1;
        else if(text.isEmpty())return 0;
        else{
           // currString=new StringBuilder(String.valueOf(text.charAt(0)));
            for (int i = 0; i <text.length() ; i++) {
                System.out.println(text.charAt(i));
                if(currString.toString().isEmpty()){
                    currString.append(text.charAt(i));
                }else{
                    //if(!currString.toString().matches("(.*)"+text.charAt(i)+"(.*)")){
                        if(!currString.toString().contains(String.valueOf(text.charAt(i)))){
                        currString.append(text.charAt(i));
                    }else {
                            i-=currString.length()-1;
                        if(currString.length()>resultString.length()||currString.length()<=1){
                            System.out.println(currString.length()+"    "+resultString.length());
                            System.out.println(currString);
                            resultString.delete(0,resultString.length());
                            resultString.append(currString);
                        }
                        //resultString.toString().isEmpty()&&i==text.length()-1?
                        currString.delete(0,currString.length());
                        currString.append(text.charAt(i));
                    }
                }
            }
        }
        return resultString.length()>=currString.length()?resultString.length():currString.length();
    }
}
