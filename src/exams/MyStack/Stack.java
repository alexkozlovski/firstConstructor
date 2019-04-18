package exams.MyStack;

import java.io.Serializable;
import java.util.RandomAccess;

public class Stack implements RandomAccess, Serializable {
    private int size;
    private int top;
    private int[] array;

    public Stack(int size) {
        array = new int[this.size = size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
public int pick(){
        if(!isEmpty()){
            return array[top];
        }
            return 0;
}
    public int pop(){
        if(!isEmpty()){
            return array[top--];
        }
        return 0;
    }
    public void push(int i) throws ArrayIndexOutOfBoundsException {
        int localVar = i;
        if (!isFull()) array[++top] = localVar;
        else throw new ArrayIndexOutOfBoundsException();

    }

    public int get(int index) throws NullPointerException {
        int localVar = index;
        if (localVar > size || localVar < 0) throw new NullPointerException("ты шо, дядя...");

        return index < size ? array[localVar] : null;
    }

    public int getSize() {
        return size;
    }
    public int getLast(){
        return array[top];
    }
    public int getFirst(){
        return array[0];
    }

}
