package observer;
/**
 * interface that BestSellers pulls from, interacts with classes that 
 * pull from Observer interface
 * @author Edward Tupacz
 * 
 */
import java.util.ArrayList;

public interface Subject {
    /**
     * empty for inheritence by BestSeller
     * @param observer 
     */
    public void registerObserver(Observer observer);
    /**
     * empty for inheritence by BestSeller
     * @param observer
     */
    public void removeObserver(Observer observer);
    /**
     * empty for inheritence by BestSeller
     * @param book
     */
    public void notifyObservers(Book book);
}
