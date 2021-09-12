package decorator;

import java.util.*;

public abstract class Character {

    protected ArrayList<String> sections = new ArrayList();

    public Character() {
        
    }

    public void draw() {
        for (int i=0;i<sections.size();i++) {
            System.out.println(sections.get(i));
        }
    }
    
}
