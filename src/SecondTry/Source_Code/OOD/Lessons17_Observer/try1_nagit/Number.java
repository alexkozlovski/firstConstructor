package SecondTry.Source_Code.OOD.Lessons17_Observer.try1_nagit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.11.2018.
 */
public class Number {
    private int number;
    private List<Observer> observers=new ArrayList<>();

    public int getInt() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyAllObservers();
    }
    public void attachObserver(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer:observers){
            observer.update();
        }
    }
}
