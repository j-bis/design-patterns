package decorator;

public class Nose extends CharacterDecorator {
    Character character;
    /**
     * takes character details and sets it to this instance to change nose
     * @param character character that will be edited
     */
    public Nose(Character character) {
        super(character);
        this.character = character;
    }
    /**
     * changes 5th item in arraylist to have nose
     */
    public void customize() {
        this.sections.set(4," |   >    |  ");
    }
    
}
