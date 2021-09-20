package factory;

public class ContemporaryPlan extends HousePlan{
    /**
     * creates superclass with instance variables for this variant
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
        setFeatures();
        setMaterials();
    }
    /**
     * i have no clue why this is here i think from vscode quick fix
     * @return this instance for some reason
     */
    public HousePlan createHousePlan() {
        return this;
    }
    /**
     * sets arraylist value of materials
     */
    protected void setMaterials() {
        //this.materials.set(0," - Ceramics \n - High-Stength Alloys \n - Composites");
        this.materials.add(" - Ceramics \n - High-Stength Alloys \n - Composites");

    }
    /**
     * sets arraylist value of features
     */
    protected void setFeatures() {
        //this.features.set(0," - Oversized Windows \n - Unconventional Roofs \n - Minimalism \n - Open Floor Plan");
        this.features.add(" - Oversized Windows \n - Unconventional Roofs \n - Minimalism \n - Open Floor Plan");
    }
    /**
     * returns title and tostring from superclass
     */
    public String toString() {
        return "Contemporary House\n" + super.toString() + "\n";//"Materials:\n" + this.materials.get(0) + "\n\nFeatures:\n" + this.features.get(0);
    }
}
