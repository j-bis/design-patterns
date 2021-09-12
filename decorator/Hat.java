package decorator;

public class Hat extends CharacterDecorator {
    Character character;
    /**
     * takes character details and sets it to this instance to change hat
     * @param character character that will be edited
     */
    public Hat(Character character) {
        super(character);
        this.character = character;
    }
    /**
     * changes first two items in arraylist to have hat
     */
    public void customize() {
        this.sections.set(0,"    ____");
        this.sections.set(1," __|____|____");
    }
}
