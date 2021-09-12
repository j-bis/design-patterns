package decorator;

public class Mouth extends CharacterDecorator {
    Character character;
    /**
     * takes character details and sets it to this instance to change mouth
     * @param character character that will be edited
     */
    public Mouth(Character character) {
        super(character);
        this.character = character;
    }
    /**
     * changes 6th item in arraylist to have mouth
     */
    public void customize() {
        this.sections.set(5,"  \\ ---- / ");
    }
}
