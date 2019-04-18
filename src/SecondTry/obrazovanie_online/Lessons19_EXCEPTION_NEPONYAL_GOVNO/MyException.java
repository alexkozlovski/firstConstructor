package SecondTry.obrazovanie_online.Lessons19_EXCEPTION_NEPONYAL_GOVNO;

public class MyException extends Exception {
    public MyException(){
        System.err.println("it's my class Exception");
    }
    public void StatException(){
        System.err.println("something wrong...");
    }
}
