package SecondTry.Lessons_Java.pt4_Advanced.Lessons161_Enum_more;


enum Level {
    BEGINNER("green") {
        public String getColor() {
            return "Color is " + color;
        }
    }, INTERMIDIATE("blue"),
    EXPERT("red");

    Level(String color) {
        this.setColor(color);
    }

    String color;

    void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Level = " + name() + ", Color: " + this.getColor();
    }
}

public class EnumLesson {
    public static void main(String[] args) {
        System.out.println(Level.BEGINNER.getColor());
        System.out.println(Level.BEGINNER.color);
        System.out.println(Level.INTERMIDIATE.toString());


    }
}
