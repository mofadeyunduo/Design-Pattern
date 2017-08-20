package observer.work.subjectInterface;

import observer.work.observerInterface.Observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new LinkedList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver(String state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

}
