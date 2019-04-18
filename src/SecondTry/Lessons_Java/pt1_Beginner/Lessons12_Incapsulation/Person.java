package SecondTry.Lessons_Java.pt1_Beginner.Lessons12_Incapsulation;

public class Person {


    private String mr="Mr.";
    private String name="Alexander";
    public String getMr() {
        return mr;
    }

    public String getName() {
        return getMr()+" "+name;
    }
}
