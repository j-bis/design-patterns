package decorator;

public class Eyes extends CharacterDecorator {
    Character character;

    public Eyes(Character character) {
        super(character);
        this.character = character;
    }
    
    public void customize() {
        this.sections.set(3," |  o  o  | ");
    }
}
