package decorator;

public class Mouth extends CharacterDecorator {
    Character character;

    public Mouth(Character character) {
        super(character);
        this.character = character;
    }
    
    public void customize() {
        this.sections.set(5,"  \\ ---- / ");
    }
}
