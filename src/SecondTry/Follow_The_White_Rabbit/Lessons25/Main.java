package SecondTry.Follow_The_White_Rabbit.Lessons25;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        DollySheet dollySheet=new DollySheet();
        DollySheet dollySheet2=foo(dollySheet);

        dollySheet.setName("Dolly");
        dollySheet2.setName("Sheet");

        System.out.println(dollySheet.getName()+"   "+dollySheet2.getName());
    }
    public static DollySheet foo(DollySheet dollySheet2) throws CloneNotSupportedException{
        DollySheet sheet=null;
        try {
             sheet=(DollySheet) dollySheet2.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return sheet;
    }
}
