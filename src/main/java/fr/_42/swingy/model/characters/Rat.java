package fr._42.swingy.model.characters;

/**
 * Created by hivian on 5/3/17.
 */
public class Rat extends Foe {

    public Rat(int level) {
        super(level);
        this.name = "Rat Attak";
        this.type = "Rat";
        this.attack = 7 + this.level;
        this.defense = 2 + this.level;
        this.hp = 20 + this.level;
    }
}
