package iterator;
import java.util.Iterator;

public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position;
    
    public FlightIterator(Flight[] flights) {
        super();
        this.flights = flights;
    }

    public boolean hasNext() {
        if (position >= flights.length || flights[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    public Flight next() {
        Flight flight = flights[position];
        position++;
        return flight;
    }
}
