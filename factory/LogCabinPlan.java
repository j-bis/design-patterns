package factory;

public class LogCabinPlan extends HousePlan {

    public LogCabinPlan() {
        super(2,10,1800);
        setFeatures();
        setMaterials();
    }

    protected void setMaterials() {
        //this.materials.set(0," - Log Siding \n - Board and Batten Siding \n - White Pine");
        this.materials.add(" - Log Siding \n - Board and Batten Siding \n - White Pine");
    }

    protected void setFeatures() {
        //this.features.set(0," - Timbered Roof \n - High Insulation \n - Rustic Effect");
        this.features.add(" - Timbered Roof \n - High Insulation \n - Rustic Effect");

    }
    public String toString() {
        return "Log Cabin\n" + super.toString() + "\n";//"Materials:\n" + this.materials.get(0) + "\n\nFeatures:\n" + this.features.get(0);
    }
}
