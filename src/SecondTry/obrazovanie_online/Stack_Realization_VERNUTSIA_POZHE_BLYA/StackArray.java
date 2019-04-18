package SecondTry.obrazovanie_online.Stack_Realization_VERNUTSIA_POZHE_BLYA;

public class StackArray   {

//boolean isEmpty(), void push(), int pop(), int peek();
    //int size,int[] array,int top

    private int size;
    private int [] array;
    private int top;

    public int getTop() {
        return top;
    }

    public StackArray(int size) {
        this.size = size;
        array=new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public void push(int a){
        if(array.length-2==top){
            int[] array1=array;
            array=new int[size*2];
            array=array1;
        }
        else
            {
        int i=++top;
        array[i]=a;
        System.out.println("top is  "+top);
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.out.println("top is  "+top);
            return 0;
        }
        else {
            return array[top--];
        }
    }
    public int pick(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            System.out.println("top is  "+top);
            return array[top];
        }
    }


}
