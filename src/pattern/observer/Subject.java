package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyu
 * @date 2021/12/22 19:46
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }
}
