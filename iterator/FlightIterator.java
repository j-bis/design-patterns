package iterator;
import java.util.Iterator;
/**
 * Iterator that checks flights array and returns the next flight in array
 * @author Edward Tupacz
 */
public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position;
    /**
     * sets this instance of FlightIterator class
     * @param flights array to be added to 
     */
    public FlightIterator(Flight[] flights) {
        super();
        this.flights = flights;
    }
    /**
     * checks array to make sure there is another flight in the array
     */
    public boolean hasNext() {
        if (position >= flights.length || flights[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }
    /**
     * returns the next flight in the array
     */
    public Flight next() {
        Flight flight = flights[position];
        position++;
        return flight;
    }
}
