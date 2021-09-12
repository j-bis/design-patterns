package decorator;

public abstract class CharacterDecorator extends Character {

    protected Character character;

    public CharacterDecorator(Character character) {
        
    }

    public abstract void customize();
}
