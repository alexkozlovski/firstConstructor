package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons201_JMX_on_the_Server_side_NA_GIT;

/**
 * Created by user on 23.09.2018.
 */
public class Hello implements HelloMBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from jmx");
    }

    @Override
    public int addIntegers(int a, int b) {
        return a+b;
    }

    @Override
    public Person returnPerson() {
        return null;
    }



}
