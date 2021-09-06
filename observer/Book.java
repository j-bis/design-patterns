package observer;
    /**
     * base class that is sent to observers
     * @author Edward Tupacz
     */
public class Book {

    private String title;
    private String authorFirstName;
    private String authorLastName;
    /**
     * sets inputs to instances of class
     * @param title title of book
     * @param authorFirstName name of author
     * @param authorLastName name of author
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    /**
     * returns instance title of book
     * @return string title of book
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * retunns instance first name of author
     * @return string author first name
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    /**
     * returns instance last name of author
     * @return string author last name
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    /**
     * takes variables and returns string to be used when called to display contents of class
     * @return string "title by: authorFirstName authorLastName"
     */
    public String toString() {
        return this.title + " by: " + this.authorFirstName + " " + this.authorLastName;
    }
}
