package iterator.ticket;

import iterator.ticket.aggreate.ListAggregate;
import iterator.ticket.iterator.Iterator;
import iterator.ticket.iteratorInterface.ListIterator;
import org.junit.Test;

public class TicketTest {

    @Test
    public void ticketTest() {
        ListAggregate aggregate = new ListAggregate();
        aggregate.add("Piers");
        aggregate.add("Fiers");
        aggregate.add("Giers");
        aggregate.add("Qiers");

        Iterator iterator = new ListIterator(aggregate);
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }

}
