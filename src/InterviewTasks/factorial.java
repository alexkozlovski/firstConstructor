package InterviewTasks;

public class factorial {
    public static int fact(int number){
        if(number==1)return 1;
        return number*fact(--number);
    }
    public static int fact2(int number){
        return number==1?1:number*fact2(--number);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact2(10));
    }
}
