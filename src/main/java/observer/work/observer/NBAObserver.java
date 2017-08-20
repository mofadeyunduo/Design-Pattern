package observer.work.observer;

import observer.work.observerInterface.Observer;
import observer.work.subjectInterface.Subject;

public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update(String state) {
        System.out.println(String.format("NBA: from %s: to %s: %s", subject, name, state));
    }

}
