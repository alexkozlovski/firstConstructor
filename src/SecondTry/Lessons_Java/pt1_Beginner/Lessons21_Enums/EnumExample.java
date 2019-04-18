package SecondTry.Lessons_Java.pt1_Beginner.Lessons21_Enums;

public class EnumExample {
    public static void main(String[] args) {
        CoffeSize Smallcup=CoffeSize.SMALL;
        CoffeSize MediumCup=CoffeSize.MEDIUM;
        CoffeSize BigCup=CoffeSize.BIG;

        System.out.println("Smallcup    "+Smallcup.getCoffeClass()+"   "+Smallcup.mililiters+"   "+Smallcup.getMililiters());
        System.out.println("MediumCup    "+MediumCup.getCoffeClass()+"   "+MediumCup.mililiters+"   "+MediumCup.getMililiters());
        System.out.println("BigCup    "+BigCup.getCoffeClass()+"   "+BigCup.mililiters+"   "+BigCup.getMililiters());
            Integer integer=new Integer(2);
    }
}
