package decorator;

public class PotatoeHead extends Character {
    Character character;

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
