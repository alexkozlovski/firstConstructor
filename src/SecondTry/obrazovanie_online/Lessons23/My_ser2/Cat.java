package SecondTry.obrazovanie_online.Lessons23.My_ser2;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String color;
    private int size;
    private double age;
    public Cat(String name,String color, int size,double age){
       this.name=name;
        this.color=color;
        this.size=size;
        this.age=age;
    }

    @Override
    public String toString() {
        return "name    -   "+name+", age   -   "+age+"   -   "+", size   -   "+size+", Color   -   "+color;
    }
    public void getInfo(){
        System.out.println(this.toString());
    }
}
