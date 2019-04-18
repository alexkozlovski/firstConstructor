package SecondTry.Source_Code.OOD.Lessons17_Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by user on 15.11.2018.
 */
public class Subject {
    private List<Observer> observers =new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
        public void attach(Observer observer){
            observers.add(observer);
        }
    private void notifyAllObservers() {
        for(Observer eachObserver: observers){
            eachObserver.update();
        }
    }
}
