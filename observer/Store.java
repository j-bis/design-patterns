package observer;

import java.util.Queue;

public class Store implements Observer {

    private Subject subject;
    private String title;
    private static Queue<Book> bestSellers;
    private static int bookcount = 0;

    public Store(Subject subject) {
        this.subject = subject;

    }

    public static void update(Book book) {
        if (bookcount < 5) {
            bestSellers.add(book);
        }
        else {
            BestSellers.removeObserver(this.Store);
        }
        bookcount++;
    }

    public static void display() {
        System.out.println("Top 5 Best Sellers:");
        while (bestSellers.peek() != null) {
            System.out.println(" - " + bestSellers.poll().toString());
        }
    }
}
