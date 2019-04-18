package SecondTry.obrazovanie_online.Lessons18_dublicate;

public class Run {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        Collect collect=new Collect(array);
        Iter iter1=collect.createFromForward();
        Iter iter2=collect.createFromBackWard();
        System.out.println("iter1");
        while(iter1.HasNext()){
            System.out.print(iter1.next()+" ");
        }
        System.out.println("\niter2");
        while(iter2.HasNext()){
            System.out.print(iter2.next()+" ");
        }

    }
}
