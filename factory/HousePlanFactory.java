package factory;
/**
 *Factory determines which floor plan to call and return
 *  @author Edward Tupacz
 */
public abstract class HousePlanFactory {
    /**
     * I dont think this was the intended solution but this was the only way
     * I could think of to get it to work
     * @param type the type of floor plan to be sent
     * @return a toString of the floorplan details
     */
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