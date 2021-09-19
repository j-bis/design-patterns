package factory;

import java.util.ArrayList;

public abstract class HousePlan {
    
    protected ArrayList<String> materials = new ArrayList();
    protected ArrayList<String> features = new ArrayList();
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {

    }

    protected void setMaterials() {

    }

    protected void setFeatures() {

    }

    public ArrayList<String> getMaterials() {

    }

    public ArrayList<String> getFeatures() {

    }

    public int getNumRooms() {

    }
    
    public int getNumWindows() {

    }

    public int getSquareFeet() {

    }

    public String toString() {

    }
}
