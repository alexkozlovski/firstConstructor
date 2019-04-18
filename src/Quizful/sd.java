package Quizful;

public class sd {
        private static sd sd=new sd();
        protected sd(){
            System.out.println("s");
        }
        public static sd getInstance(){
            return sd;
        }

}
class test{
    public void method(){
        sd s=sd.getInstance();
    }
    public static void main(String[] args) {
        new test();
        char c='1';
        char c2='\u0031';
        char c3=49;
        System.out.println(c+c2+c3);
        System.out.println(5^6&3);
    }
}
