package exams.LeetCode.task3_LongestUniqueSubstring.newaWORK;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String text="wewesdAlexKozlovsukyaadfgxs";
        StringBuilder curString=new StringBuilder();
        for (int i = 0; i <text.length() ; i++) {
            if(curString.toString().isEmpty()){
                curString.append(String.valueOf(text.charAt(i)));
            }else {
                if(!curString.toString().matches("(.*)"+text.charAt(i)+"(.*)")){
                    curString.append(text.charAt(i));
                }else {
                    list.add(curString.toString());
                    curString.delete(0,curString.length());
                    curString.append(text.charAt(i));
                }
            }
        }
        for (String s:list){
            System.out.printf("%s%n",s);
        }


    }


}
