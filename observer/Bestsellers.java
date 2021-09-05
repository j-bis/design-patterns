package observer;

import java.util.ArrayList;

public class BestSellers implements Subject {
    
    private static ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        
    }

    public static void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public static void removeObserver(Observer observer) {
        observers.remove(Observer observer);
    }

    public static void notifyObservers(Book book) {
        for (int i=0;i<bestSellers.size();i++) {
            bestSellers.get().update(book);
        }
    }

    public static void addBook(Book book) {
        bestSellers.add(book);
    }
}
