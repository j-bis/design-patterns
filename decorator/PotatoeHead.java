package decorator;
/**
 * base class of type Character that will be modified with CharacterDecorator
 */
public class PotatoeHead extends Character {
    Character character;
    /**
     * creates basic PotatoeHead with no features other than head and no hat
     */
    public PotatoeHead() {
        this.character = this;
        this.sections.add("");
        character.sections.add("");
        character.sections.add("  /      \\ ");
        character.sections.add(" |        | ");
        character.sections.add(" |        | ");
        character.sections.add("  \\      / ");
        character.sections.add("   \\____/");
    }   
}
