package fr._42.swingy.model.artifacts;

import fr._42.swingy.Utility.EArtifact;
import lombok.Getter;

/**
 * Created by hivian on 4/20/17.
 */

@Getter
public class Weapon extends Artifact {

    private int attack;

    public Weapon(String name, int attack) {
        super(name);
        this.type = EArtifact.WEAPON;
        this.attack = attack;
    }
}
