package iterator;

public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position;
    
    public FlightIterator(Flight[] flights) {

    }

    public boolean hasNext() {
        return false;
    }

    public Flight next() {
        return null;
    }
}
