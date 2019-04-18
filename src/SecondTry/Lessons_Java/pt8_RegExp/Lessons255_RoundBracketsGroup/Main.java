package SecondTry.Lessons_Java.pt8_RegExp.Lessons255_RoundBracketsGroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        //Pattern p1=Pattern.compile("Set(?:value)?"); //backreferences //?:dont use backreferences
        Pattern p1=Pattern.compile("Set(value)?");//backrefences
        Matcher m1=p1.matcher("set or SetValue Setvalue");
        while (m1.find()) System.out.println("m1    "+m1.start()+"   "+m1.group()+"  ");
        System.out.println("");


        Pattern p2=Pattern.compile("EditPad (Lite|Pro)");
        Matcher m2=p2.matcher("EditPad Lite Version");
        while (m2.find()) System.out.println("m2    "+m2.start()+"   "+m2.group()+"  ");
        System.out.println("    ");



        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)","$1 version"));
        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)","$0 version"));
        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)","$0 version"));

        Pattern p3=Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>");// \\1 - переиспользуем регулярку. т.е. нашли тэг потом ищем закрывающий тэг. равносильно для данного примера будет запись </EM>
        Matcher m3=p3.matcher("This is a <EM>test1</EM> task1_Two_Sum");
        while (m3.find()) System.out.println("m3    "+m3.start()+"   "+m3.group()+"  ");
        System.out.println("");


        Pattern p4=Pattern.compile("([a-c])x\\1x");//[a-c]x[a-c]x[a-c]
        Matcher m4=p4.matcher("axaxaxaxa");
        while (m4.find()) System.out.println("m4    "+m4.start()+"   "+m4.group()+"  ");
        System.out.println("");

        Pattern p5=Pattern.compile("([a-c])\\1");//error
        Matcher m5=p5.matcher("axaxa");
        while (m5.find()) System.out.println("m5    "+m5.start()+"   "+m5.group()+"  ");
        System.out.println("");
        Pattern p6=Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>");// \\1 - переиспользуем регулярку. т.е. нашли тэг потом ищем закрывающий тэг. равносильно для данного примера будет запись </EM>
        Matcher m6=p6.matcher("Testing <B><I>bold italic</I></B> text");
        while (m6.find()) System.out.println("m6    "+m6.start()+"   "+m6.group()+"  ");
        System.out.println("");

//        Pattern p7=Pattern.compile("([abc]+)");
        Pattern p7=Pattern.compile("([abc])+");
        Matcher m7=p7.matcher("cab");
        while (m7.find()) System.out.println("m7    "+m7.start()+"   "+m7.group()+"  ");
        System.out.println("");


        Pattern p8=Pattern.compile("([abc]+)=\\1");
        Matcher m8=p8.matcher("cab=cab");
        while (m8.find()) System.out.print("m8    "+m8.start()+"   "+m8.group()+"  ");
        System.out.println("    ");
        System.out.println("the the".replaceAll("\\b(\\w+)\\s+\\1\\b","$1"));
    }
}
