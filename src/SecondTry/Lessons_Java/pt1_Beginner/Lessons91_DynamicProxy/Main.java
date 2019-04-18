package SecondTry.Lessons_Java.pt1_Beginner.Lessons91_DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;

/**
 * Created by user on 22.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        //Myproxy myproxy=new Myproxy();
        InvocationHandler handler=new Myproxy(3);
        Comparable comparable;
        Class[] classes=new Class[]{Comparable.class, Callable.class};
        Object proxy= Proxy.newProxyInstance(null,classes,handler);
        proxy.getClass();
        System.out.println(((Comparable)proxy).compareTo(4));
        System.out.println(proxy.toString());
    }
    static class Myproxy implements InvocationHandler{
        Integer target;

        public Myproxy(Integer target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(args);
            return method.invoke(target,args);
        }
    }
}
