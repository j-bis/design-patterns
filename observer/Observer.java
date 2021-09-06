package observer;

    /**
     * Interface that Store and Customer pull from to get notified of new 
     * class Books sent to them by BestSeller
     * @author Edward Tupacz
     * 
     */
import java.util.ArrayList;

public interface Observer {
    /**
     * empty for inheritence
     * @param book
     */
    public void update(Book book);
    /**
     * empty for inheritence
     */
    public void display();
}
