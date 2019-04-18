package SecondTry.Lessons_Java.pt1_Beginner.Lessons18;

public  class Example {
    static int i=2;
   static void methode(){
      System.out.println(i);
 }


}
class OtherExample extends Example{
    public static void main(String[] args) {
        String str=new Object().toString();
        System.out.println(str);
    }
}