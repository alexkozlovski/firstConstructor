package SecondTry.Follow_The_White_Rabbit.Lessons25;

public class DollySheet implements Cloneable {

    private String name;

    private Head head=new Head();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
