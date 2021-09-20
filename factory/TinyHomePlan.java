package factory;

public class TinyHomePlan extends HousePlan {

    public TinyHomePlan() {
        super(1, 5, 200);
        setFeatures();
        setMaterials();
    }

    protected void setMaterials() {
        this.materials.set(0,"Materials:\n - Lumber\n - Insulation\n - Metal Roofing\n - Hardware");
    }

    protected void setFeatures() {
        this.features.set(0,"Features:\n - Natural Light \n - Creative Storage \n - Multipurpose areas \n - Multi-use applications");
    }

    public String toString() {
        return "Tiny House";//"Materials:\n" + this.materials.get(0) + "\n\nFeatures:\n" + this.features.get(0);
    }
}
