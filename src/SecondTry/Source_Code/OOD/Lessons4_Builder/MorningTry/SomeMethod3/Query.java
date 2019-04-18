package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod3;

/**
 * Created by user on 02.11.2018.
 */
public class Query {
    private String name;
    private String color;
    public void setName(String name){
        System.out.println("create: "+name);
        this.name=name;
    }

    public void setColor(String color) {
        System.out.println("paint: "+color);
        this.color = color;
    }
}
