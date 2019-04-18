package exams.LeetCode.task3_LongestUniqueSubstring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static StringBuilder Cach=new StringBuilder();
    public static void main(String[] args) {
        String s="aaasadfghggsdfgharr";
        String s2=s.replaceAll("(?:(.))\\1*","$1");
        System.out.println(s2);
        String[] strings=new String[s.length()];
        int index=0;
        for (int i = 0; i <s2.length() ; i++) {
            StringBuilder sCach=new StringBuilder();
            sCach.append(s2.charAt(i));
            if(Cach.toString().contains(sCach)){
                strings[index++]=sCach.toString();
                System.out.println("length before replace all \" \""+sCach.length());
                sCach.replace(0,sCach.length(),"");
            }
           else if(!Cach.toString().contains(sCach))Cach.append(sCach);

        }
        for (int i = 0,max=0; i <strings.length ; i++) {
            System.out.println(strings[i]);
            if(max<strings[i].length())max=strings[i].length();
            else if(i==strings.length) System.out.printf("length of the Longest Unique CharSequence=%d",max);
        }

        //while (true)
/*        Pattern pattern=Pattern.compile("(?:(.))\\1");
        Matcher matcher=pattern.matcher(s);
        StringBuilder stringBuilder=new StringBuilder();

        while (matcher.find()){
            System.out.println("start="+matcher.start()+", end="+matcher.end()+", group="+matcher.group());
            if(matcher.start()==0)Cach.append()
            stringBuilder+=s.substring()
        }*/
    }
}
