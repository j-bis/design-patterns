package observer;

import java.util.ArrayList;

public class Customer implements Observer {

    private Subject subject;
    private String firstName;
    private String lastName;
    private static ArrayList<Book> wishList;
    
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public static void update(Book book) {
        wishList.add(book);
    }
    /**
     * displays books and author in arraylist when called in driver
     * @return returns tostring of all books in wishList
     */
    public static void display() {
        for (int i=0;i<wishList.size();i++) {
            System.out.println(wishList.get(i).toString());
        }
    }
}
