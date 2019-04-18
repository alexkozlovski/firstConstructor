package SecondTry.Lessons_Java.pt1_Beginner.Lessons34_Garbage_Collector;

public class Run1 {
    public static void main(String[] args) {
        methode();
    }
    private static void methode(){
        Main main=new Main();
        Main main2=new Main();
        main=null;
        main2=null;
        System.gc();
/*        List_collection<Date> list=new ArrayList<Date>();
        for (int i = 0; i < 1_000_0; i++) {

            Date date=new Date();
            list.add(date);
            date=null;
            if(i%11==0)System.gc();
        }*/
    }
    public void finalize(){
        System.out.println("asdasdasdasd");
    }
}
