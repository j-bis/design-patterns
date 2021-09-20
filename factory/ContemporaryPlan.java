package factory;

public class ContemporaryPlan extends HousePlan{
        
    public ContemporaryPlan() {
        super(5, 40, 3000);
        setFeatures();
        setMaterials();
    }
    public HousePlan createHousePlan() {
        return this;
    }

    protected void setMaterials() {
        //this.materials.set(0," - Ceramics \n - High-Stength Alloys \n - Composites");
        this.materials.add(" - Ceramics \n - High-Stength Alloys \n - Composites");

    }

    protected void setFeatures() {
        //this.features.set(0," - Oversized Windows \n - Unconventional Roofs \n - Minimalism \n - Open Floor Plan");
        this.features.add(" - Oversized Windows \n - Unconventional Roofs \n - Minimalism \n - Open Floor Plan");
    }

    public String toString() {
        return "Contemporary House\n" + super.toString() + "\n";//"Materials:\n" + this.materials.get(0) + "\n\nFeatures:\n" + this.features.get(0);
    }
}
