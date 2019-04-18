package SecondTry.Lessons_Java.pt1_Beginner.Lessons46_Serialization;

import java.io.Serializable;

public class Cat implements Serializable {
    private final String NAME;
    private  int age;
    private Cup CatCup;
    public Cat(String NAME,int age,int  cup){
        this.NAME=NAME;
        this.age=age;
        this.CatCup=new Cup(cup);
    }

    public String getNAME() {
        return NAME;
    }

    public  int getAge() {
        return age;
    }

    public String toString(){

        return "His name is "+this.getNAME().toUpperCase()+"  and he is "+this.getAge()+" years Old), he have cup for coffee equal "+this.CatCup.getCupSize()+" sm.";
    }
}
