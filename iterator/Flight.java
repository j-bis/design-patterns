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
        return "";
    }

    public String getTo() {
        return "";
    }

    public int getDuration() {
        return 0;
    }

    public int getNumTransfers() {
        return 0;
    }

    public String toString() {
        return "";
    }
}
