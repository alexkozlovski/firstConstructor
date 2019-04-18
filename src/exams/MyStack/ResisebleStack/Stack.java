package exams.MyStack.ResisebleStack;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;


public class Stack implements RandomAccess, Serializable, Iterable {
    private int[] array;
    private int top;
    private int size;
    private int elementCount;

    public Stack(int size) {
        array = new int[this.size = size];
        top=-1;
        elementCount=0;
    }
    public Stack(){
        array=new int[size=10];
        top=-1;
        elementCount=0;
    }

    @Override
    public Iterator iterator() {
        return new StackIterator();
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    private boolean isFull() {
        return top == size-1 ;
    }

    public void push(int element) {
        int localVar=element;
        if(!isFull()){
            array[++top]=localVar;
            elementCount++;
        }
        else {
            ensureCapacity();
            array[++top]=localVar;
            elementCount++;
        }

    }

    public void ensureCapacity() {
        int[] localArray = array;
        array=new int[size*2];
        size=array.length;
        System.arraycopy(localArray, 0, array, 0, localArray.length);
    }

    public int getSize() {
        return size;
    }

    public int pick(){
        return array[top];
    }
    public int pop(){
        if(isEmpty())return 0;
        else {
            elementCount--;
            return array[top--];
        }
    }

    private class StackIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < top;
        }

        @Override
        public Object next() {
            return hasNext() ? array[index++] : 0;
        }
    }
}
