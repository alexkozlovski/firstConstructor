package SecondTry.obrazovanie_online.Lessons18;

public class Run {
    public static void main(String[] args) {
        Integer[] an={3,5,-7,11,11,115,27,83,-5};
        Collection collection=new Collection(an);
       Iterator iteratorForward=collection.createForward();
        Iterator iteratorBackWard=collection.createBackForward();
/*        Iterator iteratorForward=Collection.FabrClas.createForward();
        Iterator iteratorBackWard=Collection.FabrClas.createBackForward();*/
        System.out.println("iterforward");
        while(iteratorForward.HasNext()){
            System.out.print(iteratorForward.next()+"   ");
        }
        System.out.println("\niterbackforward");
        while(iteratorBackWard.HasNext()){
            System.out.print( iteratorBackWard.next()+"   ");
        }

        Iterator it=collection.createIterator();
        System.out.println("\n every 2nd");
        while(it.HasNext()){
            System.out.print( it.next()+"   ");
        }

    }
}
