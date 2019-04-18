package SecondTry.obrazovanie_online.Stack_Realization_VERNUTSIA_POZHE_BLYA.trye;

public class StackArray {
    private int[] array;

    private int top;

    public StackArray(int size){
        array=new int[size];
        top=-1;
    }


    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==array.length-1;
    }
    public void push(int a){
        if(isFull()) {
            System.out.println("Stack is Full");
        }else{
            top++;
            array[top] = a;
        }
    }
    public int pop(){
        if(isEmpty())return -1;
        else
        return array[top--];
    }
    public int pick(){
        if(isEmpty())return -1;
        else
            return array[top];
    }
/*    public String toString( ){
        StringBuilder stringBuilder=new StringBuilder();
        String str;
        for (int i = 0; i <array.length ; i++) {
            System.out.print("["+array[i]+"]    ");
        }


    }*/

    public static void main(String[] args) {
        StackArray stack=new StackArray(5);
        System.out.println("stack is Empty? -   "+stack.isEmpty());
        System.out.println("stack is full?  -   "+stack.isFull());
        stack.push(1);
        System.out.println("stack is Empty? -   "+stack.isEmpty());
        System.out.println(stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
/*        toString(stack);*/



    }
}
