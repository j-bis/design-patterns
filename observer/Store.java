package observer;

import java.util.Queue;
import java.util.LinkedList;
    /**
     * Store class with queue of books 
     * @author Edward Tupacz
     * 
     */
public class Store implements Observer {

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers = new LinkedList<>();
    /**
     * when instance is made takes subject (BestSeller) and registers
     * class as an observer
     * @param subject tyep of object to be recieved
     */
    public Store(Subject subject) {
        this.subject = subject;        
        subject.registerObserver(this);
    }
    /**
     * when signal is recieved, adds book to queue and when queue has more 
     * than 5 items dequeues 1
     * @param book item that will be added to queue
     */
    public void update(Book book) {
        bestSellers.add(book);
        if (bestSellers.size()>5) {
            bestSellers.remove();
        }
    }
    /**
     * when called dequeues each book and prints its toString() method until
     * queue is null
     */
    public void display() {
        System.out.println("Top 5 Best Sellers:");
        while (bestSellers.peek() != null) {
            System.out.println(" - " + bestSellers.poll().toString());
        }
    }
}
