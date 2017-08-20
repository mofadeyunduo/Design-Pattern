package observer.work.observerInterface;

import observer.work.subjectInterface.Subject;

public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update(String state);

}
