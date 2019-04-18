package SecondTry.Source_Code.String;

public class Lessons4_strBLD_STRbuf {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("this is ");
        stringBuffer.append("StringBuffer");
        System.out.println(stringBuffer);
        StringBuffer stringBuffer2=new StringBuffer("StringBuffer error cool thing");
        stringBuffer2.delete(12,18);
        System.out.println(stringBuffer2);

        StringBuffer stringBuffer3=new StringBuffer("StringBuffer ");
        stringBuffer3.insert(13,"Like a StringBuilder, but StringBuilder not a StringBuffer ");
        System.out.println(stringBuffer3);

        StringBuffer stringBuffer4=new StringBuffer("StringBuffer");
        stringBuffer4.replace(0,12,"StringBuilder");
        System.out.println(stringBuffer4);

        StringBuffer stringBuffer5=new StringBuffer("StringBuffer");
        stringBuffer5.reverse();
        System.out.println(stringBuffer5);


    }
}
