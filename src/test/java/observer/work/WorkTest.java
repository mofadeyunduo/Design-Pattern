package observer.work;

import observer.work.observer.NBAObserver;
import observer.work.observer.StockObserver;
import observer.work.observerInterface.Observer;
import observer.work.subject.BossSubject;
import observer.work.subjectInterface.Subject;
import org.junit.Test;

public class WorkTest {

    @Test
    public void workTest() {
        Subject subject = new BossSubject();
        Observer observer1 = new StockObserver("Piers", subject);
        Observer observer2 = new NBAObserver("Fiers", subject);

        subject.attach(observer1);
        subject.attach(observer2);
        subject.notifyObserver("I am back");
    }

}
