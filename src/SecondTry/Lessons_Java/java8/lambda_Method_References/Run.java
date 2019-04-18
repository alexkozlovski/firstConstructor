package SecondTry.Lessons_Java.java8.lambda_Method_References;

import java.util.*;
import java.util.stream.Stream;

public class Run {
    public static void main(String[] args) {
        Stream.of("one","two","three").map(String::toUpperCase).forEach(System.out::println);
        Set<Student> students=new TreeSet<>(new StudentComporator());
/*        Stream.of("ALex","Alexey","Masha","Pasha","hz","victor").map(Student::new).map(students::add);
        System.out.println(students);*/
        String[] strings={"ALex","Alexey","Masha","Pasha","hz","victor","victor","victor","victor"};
        for (String s:strings){
            students.add(new Student(s));
        }
        System.out.println(students);
        students.forEach(x-> System.out.println(x.hashCode()));

    }
}
class Student{
    private String name;
    private int age;
    public Student(String name) {
        age=Math.abs(new Random().nextInt(3));
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+" "+age+" age old";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(name);
    }
}
class StudentComporator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()-o1.getAge();
    }
}