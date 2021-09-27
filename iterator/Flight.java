package iterator;
/**
 * base class that will have instances created and returned as a String
 * @author Edward Tupacz
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;
    /**
     * Constructor that sets instance variables in individual instances of Flight class
     * @param flightNum String flight number
     * @param from String of flight starting area
     * @param to String of flight destination
     * @param duration int of time that flight(s) will take
     * @param transfers how many different flights are needed to reach area
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    /**
     * returns instance variable for toString
     * @return String from in this instance
     */
    public String getFrom() {
        return this.from;
    }
    /**
     * returns instance variable for toString
     * @return String to in this instance
     */
    public String getTo() {
        return this.to;
    }
    /**
     * returns the duration of the trip in this instance as an int
     * looking at this and doing javadoc I realize I should've changed it to a 
     * string return and had it return the duration already formatted
     * @return
     */
    public int getDuration() {
        // int hours = (this.duration-this.duration%60)/60;
        // int minutes = this.duration%60;
        return this.duration;
    }
    /**
     * returns instance variable for toString
     * @return int transfers in this instance
     */
    public int getNumTransfers() {
        return this.transfers;
    }
    /**
     * returns properly formatted output of class details when class is called as an output
     */
    public String toString() {
        if (getNumTransfers()>1) {
            return "Flight Number: " + this.flightNum + "\nFrom: " + getFrom() 
            + "\nTo: " + getTo() + "\nDuration: " + (getDuration()-getDuration()%60)/60 
            + " hours " + getDuration()%60 + " minutes\n" + getNumTransfers() + " Transfers";
        }
        else if (getNumTransfers() == 0) {
            return "Flight Number: " + this.flightNum + "\nFrom: " + getFrom()
            + "\nTo: " + getTo() + "\nDuration: " + (getDuration()-getDuration()%60)/60 
            + " hours " + getDuration()%60 + " minutes" + "\nDirect Flight";
        }
        return "Flight Number: " + this.flightNum + "\nFrom: " + getFrom()
        + "\nTo: " + getTo() + "\nDuration: " + (getDuration()-getDuration()%60)/60 
        + " hours " + getDuration()%60 + " minutes\n" + getNumTransfers() + " Transfer";
    }
}