package iterator;
/**
 * class made to run and test functionality of Flight class
 * @author Edward Tupacz
 */
public class testdriver {
    /**
     * adds a new flight copied from AirlineDriver and prints it out
     */
    public void run() {
        Flight newflight = new Flight("773C", "NY", "Charlotte", 120, 0);
        System.out.println(newflight);
    }
    /**
     * runs driver
     * @param args argument
     */
    public static void main(String[] args){
        testdriver driver = new testdriver();
        driver.run();
    }
}
