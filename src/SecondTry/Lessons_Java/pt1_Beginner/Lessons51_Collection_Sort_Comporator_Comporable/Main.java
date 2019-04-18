package SecondTry.Lessons_Java.pt1_Beginner.Lessons51_Collection_Sort_Comporator_Comporable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set set=new TreeSet();
        set.add(new Person(2));
        set.add(new Person(1));
        set.add(new  Person(5));
        set.add(new Person(3));
        set.add(new Person(4));
        for (Object o:
             set) {
            System.out.println(o);
        }
        Person person=new Person(11);
        Person person2=new Person(12);
        if(person.compareTo(person2)>0){
            System.out.println(person+" older than: "+person2);
        }else if(person.compareTo(person2)==0){
            System.out.println(person+" and "+person2+": are the same age.");
        }else System.out.println(person2+" older than: "+person);
        int i=12;
        int a=(i<10)?i:(i==10?i:--i);
        System.out.println(a);
    }
}
class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        if(this.getAge()<p.getAge()){
            return -1;
        }else if(this.getAge()==p.getAge())return 0;
        return 1;
    }
}