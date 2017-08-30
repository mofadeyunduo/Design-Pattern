package iterator.ticket.iteratorInterface;

import iterator.ticket.aggreate.ListAggregate;
import iterator.ticket.iterator.Iterator;

public class ListIterator implements Iterator {

    private ListAggregate aggregate;
    private int count = 0;

    public ListIterator(ListAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return count < aggregate.count() ? aggregate.get(0) : null;
    }

    @Override
    public Object next() {
        return count < aggregate.count() ? aggregate.get(count++) : null;
    }

    @Override
    public boolean isDone() {
        return count == aggregate.count();
    }

    @Override
    public Object currentItem() {
        return count < aggregate.count() ? aggregate.get(count) : null;
    }

}
