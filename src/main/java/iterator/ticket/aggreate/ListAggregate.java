package iterator.ticket.aggreate;

import iterator.ticket.aggreateInterface.Aggregate;
import iterator.ticket.iterator.Iterator;
import iterator.ticket.iteratorInterface.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class ListAggregate implements Aggregate {

    private List<Object> objects = new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return new ListIterator(this);
    }

    public void add(Object o) {
        objects.add(o);
    }

    public Object get(int idx) {
        return objects.get(idx);
    }

    public int count() {
        return objects.size();
    }

}
