package SecondTry.Lessons_Java.pt4_Advanced.Lessons159_Static_Inicialaizer;

public class StaticInitLesson2 {
        static int i;
        int j;
    public static void main(String[] args) {
       // System.out.println(i);
        Student student=new Student(){
            @Override
            void sayhello() {
                System.out.println("hehe");
            }
        };
        student.sayhello();

    }
    interface Car{
        int k=i;
        //int n=j;
    }
    static class Student{
        void sayhello(){
            System.out.println("asd");
        }
    }

}
