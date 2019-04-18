package SecondTry.obrazovanie_online.Lessons19_EXCEPTION_NEPONYAL_GOVNO;
/*ошибки бывают:
 * -Логические
 * -Синтаксические
 * исключительные ситуация:
 * checked -Exception
 * unchecked - Error
 * Runtime - искл ситуация во время выполнения uncheked*/
public class Run {
    public static void main(String[] args) {
/*        int a=2;
        int b=0;
        int r=0;
        try2 {
            r=a/b;
        }catch (ArithmeticException e){

            e.printStackTrace();

        }

        System.out.println(r);*/

        A a=new A();
        try {
           double r= a.pow(-6);
            System.out.println(r);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            a.f();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
