package factory;

import java.util.ArrayList;

public abstract class HousePlan {
    
    protected ArrayList<String> materials = new ArrayList<String>();
    protected ArrayList<String> features = new ArrayList<String>();
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        //super();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        setFeatures();
        setMaterials();
    }

    protected abstract void setMaterials();

    protected abstract void setFeatures();
    
    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    public ArrayList<String> getFeatures() {
        return this.features;
    }

    public int getNumRooms() {
        return this.numRooms;
    }
    
    public int getNumWindows() {
        return this.numWindows;
    }

    public int getSquareFeet() {
        return this.squareFeet;
    }

    public String toString() {
        return "Square Feet: " + this.getSquareFeet() 
        + "\nRoom: " + this.getNumRooms()
        + "\nWindows: " + this.getNumWindows()
        + "\n\nMaterials:\n" + this.getMaterials().get(0) 
        + "\n\nFeatures:\n" + this.getFeatures().get(0);
    }
}
