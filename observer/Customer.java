package observer;

import java.util.ArrayList;
/**
 * customer class that recieves all books in a wishlist that does not auto-prune
 * @author Edward Tupacz
 */
public class Customer implements Observer {

    private Subject subject;
    private String firstName;
    private String lastName;
    private static ArrayList<Book> wishList = new ArrayList<Book>();
    /**
     * sets input to instances and registers class as an observer
     * @param subject (bestseller) the subject that will be sent to this class
     * @param firstName name of customer (unused)
     * @param lastName name of customer (unused)
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        subject.registerObserver(this);
    }
    /**
     * adds book to ArrayList wishlist
     * @param book item to be added to wishlist
     */
    public void update(Book book) {
        wishList.add(book);
    }
    /**
     * displays books and author in arraylist when called in driver
     * @return returns tostring of all books in wishList
     */
    public void display() {
        System.out.println("\nWish List:");
        for (int i=0;i<wishList.size();i++) {
            System.out.println(" - " + wishList.get(i).toString());
        }
    }
}
