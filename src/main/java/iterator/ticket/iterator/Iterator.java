package iterator.ticket.iterator;

public interface Iterator {

    Object first();

    Object next();

    boolean isDone();

    Object currentItem();

}
