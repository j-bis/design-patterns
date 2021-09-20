package factory;

public abstract class HousePlanFactory {
    
    public static HousePlan createHousePlan(String type) {
        if (type.equals("log cabin")) {
            HousePlan log = new LogCabinPlan();
            return log;
        }
        if (type.equals("Tiny Home")) {
            HousePlan tiny = new TinyHomePlan();
            return tiny;
        }

        if (type.equals("contemporary home")) {
            HousePlan temp = new ContemporaryPlan();
            return temp;
        }
        else return null;
    } 
}