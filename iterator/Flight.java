package iterator;

public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return this.from;
    }

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

    public int getNumTransfers() {
        return this.transfers;
    }

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