package SecondTry.Lessons_Java.pt1_Beginner.Lessons51_Collection_Sort_Comporator_Comporable.try_IComporator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        ComparePerson comparePerson=new ComparePerson();
        Set set=new TreeSet(comparePerson);
        set.add(new Person(2));
        set.add(new Person(1));
        set.add(new Person(5));
        set.add(new Person(3));
        set.add(new Person(4));
        for (Object o:
                set) {
            System.out.println(o);
        }
    }
}
class ComparePerson implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getAge()-o1.getAge();
    }
}
class Person  {
    private int age;

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

}