package strategy;

import java.util.ArrayList;
/*
 * Interface for the 2 types of search
 * @author Edward Tupacz
 * */
public interface SearchBehavior {

	/*
	 * basic search command
	 * @param data the arraylist to look through, item the item to look for
	 * */
    public static boolean contains(ArrayList<String> data, String item) {
		// TODO Auto-generated method stub
		return false;
	}

    //doing it wrong when i realized how to properly use an interface
    /*
    public int searchmode = 0;
    public boolean contains(ArrayList<String> data, String item) {
        if (searchmode = 0;) {
            return LinearSearch.contains(data, item);
        }
        else {
            return BinarySearch.contains(data, item);
        }
    }*/
}
