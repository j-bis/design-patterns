package observer;

import java.util.Queue;

public class Store implements Observer {

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
    }

    public static void update(Book book) {

    }

    public static void display() {

    }
}
