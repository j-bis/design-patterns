package decorator;

public abstract class CharacterDecorator extends Character {

    protected Character character;

    public CharacterDecorator(Character character) {
        super();
        this.character = character;
        for (int i=0;i<character.sections.size();i++) {
            this.sections.add(character.sections.get(i));
        }
        this.customize();
        //characterdecorator has its own sections arraylist
        //character has a "character." 
        //character decorator is "this."
    }

    public abstract void customize();
}
