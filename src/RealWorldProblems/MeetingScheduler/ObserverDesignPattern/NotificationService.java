package RealWorldProblems.MeetingScheduler.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class NotificationService {
    List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer){
        observers.add(observer);
    }

    public void removeObservers(Observer observer){
        this.observers.remove(observer);
    }

    public abstract void notify(String message);
}
