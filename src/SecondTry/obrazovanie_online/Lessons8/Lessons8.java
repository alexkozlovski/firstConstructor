package SecondTry.obrazovanie_online.Lessons8;

public class Lessons8 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Lessons8(String name, int age){
        this.name=name;
        this.age=age;

    }
    @Override
    public String toString(){

        return this.getName()+" "+this.getAge();
    }
    public static void raiseAge(Lessons8 les){
        les.age=les.getAge()+1;
        System.out.println(les.toString());
    }
    public static void main(String[] args) {
        Lessons8[] lessons8s=new Lessons8[2];
        lessons8s[0]=new Lessons8("Alex",12);
        lessons8s[1]=new Lessons8("Alexey",13);
        for (int i = 0; i < lessons8s.length ; i++) {
            System.out.println(lessons8s[i].toString());

        }
        for (int i = 0; i <lessons8s.length ; i++) {
            raiseAge(lessons8s[i]);
        }

    }
}
