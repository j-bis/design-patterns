package decorator;

import java.util.*;

/**
 * base class that PotatoeHead will pull from with draw command that outputs the PotatoeHead
 * @author Edward Tupacz
 */

public abstract class Character {

    protected ArrayList<String> sections = new ArrayList();
    /**
     * basic constructor used by extending classes
     */
    public Character() {
        
    }
    /**
     * goes through sections ArrayList and outputs each line in it to draw a head
     */
    public void draw() {
        for (int i=0;i<sections.size();i++) {
            System.out.println(sections.get(i));
        }
    }
    
}
