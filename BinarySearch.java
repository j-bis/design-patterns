import java.util.*;

/**
 * reference for sort:
 * https://beginnersbook.com/2013/12/how-to-sort-arraylist-in-java/
 * 
 * search through the arraylist but not linearly
 * @author Edward Tupacz
 * 
 */

public class BinarySearch implements SearchBehavior {
	
	
	/*
	 * made to get size of arraylist and call recursive method
	 * @param data arraylist, item being the String to look for
	 * @return true if item is found, false if not
	 * */
    public boolean contains(ArrayList<String> data, String item) {
        Collections.sort(data);
        int size = data.size();
        return bsearch(data, item);
    }
    
	/*
	 * recursive method splitting the arraylist into 2 others to be sorted again until there is nothing else to search
	 * @param data2 the arraylist to search, item2 the String to look for
	 * @return true if item is found, false if not
	 * */
    public boolean bsearch(ArrayList<String> data2, String item2) {

       while(data2 != null) {
       /* if (data2.get(0) == null) {
            return false;
        }*/
        ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
            int size = data2.size();
            if (item2.equalsIgnoreCase(data2.get(size))) {
                return true;
            }
            else {
               // ArrayList<String> left = new ArrayList<String>();
                for (int i=0;i<size/2;i++) {
                    left.add(data2.get(i));
                }
              //  ArrayList<String> right = new ArrayList<String>();
                for (int i=0;i<size/2;i++) {
                    right.add(data2.get(i+(size/2)));
                }
            }
            bsearch(left, item2);
            bsearch(right, item2);
            
        }
       return false;

   	/*
   	 * tried rebuilding old method used last year in 146
   	 * 
   	 * */
        /*
        String[] left = new String[size/2]
        String[] right = new String[size/2]
        for (i=0;i<size/2;i++) {
            left[i] = data2.get(i);
            right[i] = data2.get(i+(size/2));
        }
        */
    }
}
