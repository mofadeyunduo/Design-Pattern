package observer.work.observer;

import observer.work.observerInterface.Observer;
import observer.work.subjectInterface.Subject;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update(String state) {
        System.out.println(String.format("Stock: from %s: to %s: %s", subject, name, state));
    }

}
