package decorator;

public class Hat extends CharacterDecorator {
    Character character;

    public Hat(Character character) {
        super(character);
        this.character = character;
    }

    public void customize() {
        this.sections.set(0,"    ____");
        this.sections.set(1," __|____|____");
    }
}
