package SecondTry.Lessons_Java.pt1_Beginner.Lessons21_Enums;

public enum CoffeSize {
    SMALL(100){
        String getCoffeClass() {
            return "C";
        }

    }, MEDIUM(200){
        String getCoffeClass() {
            return "B";
        }

    }, BIG(300){
        String getCoffeClass() {
            return "A";
        }

    };



        int mililiters;
        String coffeClass;

        CoffeSize(int mililiters) {
            this.mililiters = mililiters;
        }

        int getMililiters() {
            return mililiters;
        }

        String getCoffeClass() {
            return coffeClass;
        }


    }

