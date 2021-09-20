package factory;
/**
 * Creates version of HousePlan with Tiny Home variant
 */
public class TinyHomePlan extends HousePlan {
    /**
     * calls superclass with room numbers, window numbers, and size then calls to set arraylist values
     */
    public TinyHomePlan() {
        super(1, 5, 200);
        setFeatures();
        setMaterials();
    }
    /**
     * sets arraylist values that really could have been a string with the way i did it because i didnt
     * feel like making a loop in the tostring to go through everything
     */
    protected void setMaterials() {
        //this.materials.set(0,"Materials:\n - Lumber\n - Insulation\n - Metal Roofing\n - Hardware");
        this.materials.add(" - Lumber\n - Insulation\n - Metal Roofing\n - Hardware");
    }
    /**
     * sets features with this variant
     */
    protected void setFeatures() {
        //this.features.set(0,"Features:\n - Natural Light \n - Creative Storage \n - Multipurpose areas \n - Multi-use applications");
        this.features.add(" - Natural Light \n - Creative Storage \n - Multipurpose areas \n - Multi-use applications");
    }
    /**
     * actually took me forever to figure out what you meant by "return the supers tostring" but 
     * this is really cool
     * returns this title and all the data in the superclass's tostring
     */
    public String toString() {
        return "Tiny House\n" + super.toString() + "\n";//"Materials:\n" + this.materials.get(0) + "\n\nFeatures:\n" + this.features.get(0);
    }
}
