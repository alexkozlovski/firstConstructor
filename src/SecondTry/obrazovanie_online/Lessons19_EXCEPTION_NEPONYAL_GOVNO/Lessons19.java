package SecondTry.obrazovanie_online.Lessons19_EXCEPTION_NEPONYAL_GOVNO;

public class Lessons19 {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        try {
            Thread.sleep(6);
            int r=a/b;
            A a1=new A();
            a1.pow(-8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (MyException e){
            e.StatException();
        }
        finally {
            System.err.println("exception was processed");
            System.exit(0);

        }
    }
}
