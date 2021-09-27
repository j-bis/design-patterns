package iterator;
/**
 * Class that creates instances of Flight and creates iterator to run through an array with provided input
 * @author Edward Tupacz
 */
public class Airline {
    private String title;
    private Flight[] flights = new Flight[2];
    private int size =0;
    /**
     * constructor that sets instance variables
     * @param title title of airline
     */
    public Airline(String title) {
        this.title = title;
    }
    /**
     * creates a new Flight class instance with given variables and adds it to flights array.
     * If no room in array, calls growArray(flights) to double array size.
     * @param flightNum String flight number
     * @param from String of flight starting area
     * @param to String of flight destination
     * @param duration int of time that flight(s) will take
     * @param transfers how many different flights are needed to reach area
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
            if (size >= flights.length) {
                flights = growArray(flights);
            }
            Flight new_flight = new Flight(flightNum, from, to, duration, transfers);
            flights[size] = new_flight;
            size++;
        }
    /**
     * retrieves title in instance
     * @return title of airline
     * why is this here if we dont use it
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * creates a new array that has double the size of the old array and returns it as new array
     * @param flights old array that is full and needs to be doubled
     * @return new array to overwrite old array
     */
    private Flight[] growArray(Flight[] flights) {
        Flight[] ret = new Flight[flights.length*2];
        for (int i=0; i < flights.length; i++) {
            ret[i] = flights[i];
        }
        return ret;
    }
    /**
     * creates an instance of FlightIterator that pulls from Iterator
     * @return a new FlightIterator class to run the program
     */
    public FlightIterator createIterator() {
        FlightIterator flight = new FlightIterator(flights);
        return flight;
    }
}
