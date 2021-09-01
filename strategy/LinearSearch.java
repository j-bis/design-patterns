package strategy;

import java.util.ArrayList;

/*
 * default search that goes through the array list one item at a time linearly
 * @author Edward Tupacz
 * */
public class LinearSearch implements SearchBehavior {
	
	/*
	 * search through the list one item at a time
	 * @param data the arraylist to search through, item the String to look for
	 * @return true if item is found, false if not
	 * */
    public static boolean contains(ArrayList<String> data, String item) {
        for (int i=0;i<data.size();i++) {
            if (item.equalsIgnoreCase(data.get(i))) {
                return true;
            }
        }
        return false;
    }
}
