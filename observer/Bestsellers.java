package observer;

import java.util.ArrayList;
/**
 * class that sends Books to observers
 * @author Edward Tupacz
 * 
 */
public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    /**
     * when instance of class is created, makes a new arraylist for observers
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
    }
    /**
     * i dont remember what override does
     * adds inputted observer to ArrayList observers
     * @param observer a class to recieve something when notified
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * removes inputted observer from ArrayList observers so they dont get notified
     * @param observer class that no longer wants to recieve stuff
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * goes through arraylist of observers and sends each of them book
     * @param book book that is sent to observers
     */
    public void notifyObservers(Book book) {
        for(int i=0;i<observers.size();i++) {
            observers.get(i).update(book);            
        }
    }
    /**
     * runs notifyObservers() method to send book
     * @param book book to be sent
     */
    public void addBook(Book book) {
        //for(int i=0;i<observers.size();i++) {
        //    bestSellers.get(i).add(book);            
        //}
        //bestSellers.add(book);
        notifyObservers(book);
    }
}
