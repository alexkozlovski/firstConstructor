package SecondTry.obrazovanie_online.Lessons23.mySer;

import java.io.Serializable;

public class A implements Serializable {
    int age;
    String name;
    public A(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "His name is \""+name+"\" and he is "+age+" years old.";
    }
}
