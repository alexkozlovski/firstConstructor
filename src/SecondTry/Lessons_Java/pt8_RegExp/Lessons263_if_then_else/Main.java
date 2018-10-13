package SecondTry.Lessons_Java.pt8_RegExp.Lessons263_if_then_else;

/**
 * Created by user on 11.10.2018.
 */
import  jregex.Matcher;
import  jregex.Pattern;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        //need jRegex http://jregex.sourceforge.net/
        //(?ifthenelse)
        //(?ifthen)
        //(?(?=regex)then|else)
        //(?(?=(?condtion)(then1|then2)|then3)|(else1|else2|else|3))
        Pattern p=new Pattern("(a)?b(?(1)c|d)");
        //ищем букву а, которая может присутствовать, а может не присутствовать
        //далее ищем букву b, потом ссылаемся на первую группу -(a) была она найдена или нет. не была найдена и мы d then не идем
        //идем в else, а там d, что соотвутствует матчеру - bd
        Matcher m1=p.matcher("bd");
        main.check(m1,1);

        Matcher m2=p.matcher("abc");//есть буква a, потом есть ,была буква b и т.к. было, то соотвествует abc
        main.check(m2,2);

        Matcher m3=p.matcher("abd");//найдет bd, т.к. пойдет по кругу. т.е. начнет с bd
        main.check(m3,3);



    }
    public   void check(Matcher m,int num){
        System.out.println("__Matcher №"+num);
        while (m.find()){
            System.out.println(m.start()+"  "+m);
        }
        System.out.println("\n");
    }
}
