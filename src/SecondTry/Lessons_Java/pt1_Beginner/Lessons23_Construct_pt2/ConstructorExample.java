package SecondTry.Lessons_Java.pt1_Beginner.Lessons23_Construct_pt2;
class MyParent{
    MyParent(){
        System.out.println("myparentConstruct");
    }
}
public class ConstructorExample extends MyParent{
    int i=20;
    ConstructorExample(int i){
        this.i=i;
    }

    public static void main(String[] args) {
        ConstructorExample c=new ConstructorExample(20);

    }
}
