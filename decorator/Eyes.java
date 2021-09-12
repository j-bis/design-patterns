package decorator;
/**
 * changes eyes of potatoehead
 */
public class Eyes extends CharacterDecorator {
    Character character;
    /**
     * takes character details and sets it to this instance to change eyes
     * @param character character that will be edited
     */
    public Eyes(Character character) {
        super(character);
        this.character = character;
    }
    /**
     * changes 4th item in arraylist to have eyes
     */
    public void customize() {
        this.sections.set(3," |  o  o  | ");
    }
}
