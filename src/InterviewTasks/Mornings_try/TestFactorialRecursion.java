package InterviewTasks.Mornings_try;

public class TestFactorialRecursion {
    public static int factorial(int number){
        if(number==1)return number;
        return number*factorial(--number);
    }
    public static int factorial2(int numb){
        if(numb==0)return numb;
        if(numb<0)return numb==-1?numb:numb*factorial2(++numb);
        return numb==1?numb:numb*factorial2(--numb);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial2(10));
        System.out.println(factorial2(-10));
    }
}
