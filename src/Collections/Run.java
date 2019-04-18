package Collections;

import java.lang.reflect.Field;
import java.util.Objects;

public class Run {
    public static void main(String[] args) {
        final long Byte=0;
        A a=new A("ass");
        A a1=new A("ass");
        System.out.println((a==a1)+"  "+a.equals(a1));

        try {
            Field[] fields= A.class.getFields();
            Field fielda=A.class.getDeclaredField("s");
            fielda.setAccessible(true);

            for (Field field:fields){
                field.setAccessible(true);
                System.out.println((String)field.get(new A()));
            }
        }catch (NoSuchFieldException e){
          e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
class A{
    String s=null;
    int a=2;

    public A(String s, int a) {
        this.s = s;
        this.a = a;
    }

    public A() {
    }

    public A(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(this.s, a.s);
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(s);
    }
}