package decorator;
/**
 * class that takes extra details and puts them into the character through customize call
 */
public abstract class CharacterDecorator extends Character {

    protected Character character;
    /**
     * takes inputted character, copies details in arraylist to one in this constructor 
     * and calls customize with this type of CharacterDecorator
     * @param character the character (PotatoeHead) that will be modified
     */
    public CharacterDecorator(Character character) {
        super();
        this.character = character;
        for (int i=0;i<character.sections.size();i++) {
            this.sections.add(character.sections.get(i));
        }
        this.customize();
        //characterdecorator has its own sections arraylist
        //character has a "character." 
        //character decorator is "this."
    }
    /**
     * does nothing because its superclass
     */
    public abstract void customize();
}
