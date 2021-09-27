package iterator;

public class Airline {
    private String title;
    private Flight[] flights = new Flight[2];
    private int size =0;

    public Airline(String title) {
        this.title = title;
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
            if (size >= flights.length) {
                flights = growArray(flights);
            }
            Flight new_flight = new Flight(flightNum, from, to, duration, transfers);
            flights[size] = new_flight;
            size++;
        }

    public String getTitle() {
        return this.title;
    }

    private Flight[] growArray(Flight[] flights) {
        Flight[] ret = new Flight[flights.length*2];
        for (int i=0; i < flights.length; i++) {
            ret[i] = flights[i];
        }
        return ret;
    }

    public FlightIterator createIterator() {
        FlightIterator flight = new FlightIterator(flights);
        return flight;
    }
}
