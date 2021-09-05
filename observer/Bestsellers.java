package observer;

import java.util.ArrayList;

public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        for(int i=0;i<observers.size();i++) {
            observers.get(i).update(book);            
        }
    }

    public void addBook(Book book) {
        //for(int i=0;i<observers.size();i++) {
        //    bestSellers.get(i).add(book);            
        //}
        //bestSellers.add(book);
        notifyObservers(book);
    }
}
