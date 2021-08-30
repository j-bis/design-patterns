import java.util.ArrayList;

public class GuestList {
	
	/*
	 * The guest list and methods to edit it
	 * @author Edward Tupacz
	 * 	 * */
	
	private String title;
	private ArrayList<String> people = new ArrayList<String>();
	private SearchBehavior searchBehavior = new LinearSearch();
	
	/*
	 * sets title of the instance of class
	 * @param in name of class
	 * */
	
	public GuestList(String in) {
		title = in;	
	}
	
	/*
	 * adds a person to the guest list
	 * @param person name of person to be added to guest list
	 * @return true if person is not there and is added, false if person is already on there
	 * */
	public boolean add(String person) {
		if (SearchBehavior.contains(people, person)) {
            return false;
        }
        else {
            people.add(person);
            return true;
        }
	}
	/*
	 * removes a person on the guest list
	 * @param person name of person to be removed
	 * @return true if person was on there and removed, false if not on there already
	 * */
	public boolean remove(String person) {
		if (SearchBehavior.contains(people, person)) {
            return true;
        }
        else {
            return false;
        }
	}
	/*
	 * get title of this instance of class
	 * @return title of this instance of class
	 * */
	public String getTitle() {
		return this.title;
	}
	/*
	 * changes type of search being performed in instance of class
	 * @param searchBehavior type of searchbehavior to be set to (binary search)
	 * */
	public void setSearchBehavior(SearchBehavior searchbehavior) {
		//if (searchbehavior.equalsIgnoreCase("bSearch")) {
            this.searchBehavior = searchbehavior;
            //searchBehavior.searchmode = 1;
        }
	/*
	 * get the arraylist in this instance of class
	 * @return the arraylist in this instance of class
	 * */
	public ArrayList<String> getList() {
		return this.people;
	}
	
}
