package SecondTry.Lessons_Java.pt1_Beginner.Lessons46_Serialization;

import java.io.Serializable;

public class Cup implements Serializable {
    public  final int cupSize;
    public Cup(int cupSize){
        this.cupSize=cupSize;
    }

    public int getCupSize() {
        return cupSize;
    }
}
