package SecondTry.obrazovanie_online.Lessons18_Dublicate2_Collect_Obj;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Integer[] myArray=new Integer[9];
        for (int i = 0; i <myArray.length; i++) {
            Random r=new Random();
            /*myArray[i]=-5+r.nextInt(6);*/
            myArray[i]=i;
            System.out.print(myArray[i]+"   ");
        }
        MyCollection myCollection=new MyCollection(myArray);
        MyIterator iter1=myCollection.creatIterFromForward();
        MyIterator iter2=myCollection.createIterFromBackward();
        System.out.println("\niter1");
        while (iter1.hasNext()){
            System.out.print(iter1.next()+"   ");
        }
        System.out.println("\niter2");
        while (iter2.hasNext()){
            System.out.print(iter2.next()+"   ");
        }


    }
}
