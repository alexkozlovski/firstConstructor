package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod2;

/**
 * Created by user on 02.11.2018.
 */
public class Query {
    private String name;
    private String color;
    private String type;
    private int maxSpeed;

    public void setColorCar(String color){
        this.color=color;
        System.out.println("color:"+color);
    }
    public void setName(String name){
        this.name=name;
        System.out.println("name:"+name);
    }
    public void setType(String type){
        this.type=type;
        System.out.println("type:"+type);
    }
    public void SetMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
        System.out.println("maxSpeed:"+maxSpeed);
    }
    public String getInfo(){
        String s;
        s="Car: name - "+name+"; color - "+color+"; type - "+type+", max speed = "+maxSpeed;
        return s;
    }
}
