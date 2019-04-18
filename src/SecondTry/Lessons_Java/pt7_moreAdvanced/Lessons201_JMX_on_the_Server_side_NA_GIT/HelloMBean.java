package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons201_JMX_on_the_Server_side_NA_GIT;

/**
 * Created by user on 23.09.2018.
 */
public interface HelloMBean {
    void sayHello();
    int addIntegers(int a,int b);
    Person returnPerson();

    String getName();
    void setName(String name);
}
