package factory;

import java.util.ArrayList;
/**
 * Base floor plan takes numbers from floorplan classes and pulls output to return them
 */
public abstract class HousePlan {
    
    protected ArrayList<String> materials = new ArrayList<String>();
    protected ArrayList<String> features = new ArrayList<String>();
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * constructs class from subclass and sets to this instance
     * @param numRooms number of rooms taken from subclass
     * @param numWindows nubmer of windows taken from subclass
     * @param squareFeet size of room also taken from subclass
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        super();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        //setFeatures();
        //setMaterials();
    }
    /**
     * set data things in subclasses
     */
    protected abstract void setMaterials();
    protected abstract void setFeatures();
    /**
     * gets this instance variable for toString
     * @return materials arraylist
     */
    public ArrayList<String> getMaterials() {
        return this.materials;
    }
    /**
     * gets this instance variable for toString
     * @return features arraylist
     */
    public ArrayList<String> getFeatures() {
        return this.features;
    }
    /**
     * gets this instance variable for toString
     * @return room numbers 
     */
    public int getNumRooms() {
        return this.numRooms;
    }
    /**
     * gets this instance variable for toString
     * @return window number
     */
    public int getNumWindows() {
        return this.numWindows;
    }
    /**
     * gets this instance variable for toString
     * @return room size in feet
     */
    public int getSquareFeet() {
        return this.squareFeet;
    }
    /**
     * pulls variables from subclass after setting and is printed when returned to driver
     * @return floor plan details for each class
     */
    public String toString() {
        return "Square Feet: " + this.getSquareFeet() 
        + "\nRoom: " + this.getNumRooms()
        + "\nWindows: " + this.getNumWindows()
        + "\n\nMaterials:\n" + this.getMaterials().get(0) 
        + "\n\nFeatures:\n" + this.getFeatures().get(0);
    }
}
