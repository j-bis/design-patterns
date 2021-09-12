package decorator;

public class Nose extends CharacterDecorator {
    Character character;
    
    public Nose(Character character) {
        super(character);
        this.character = character;
    }

    public void customize() {
        this.sections.set(4," |   >    |  ");
    }
    
}
