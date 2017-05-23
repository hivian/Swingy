package fr._42.swingy.model.artifacts;

import fr._42.swingy.Utility.EArtifact;
import lombok.Getter;

/**
 * Created by hivian on 4/20/17.
 */
@Getter
public class Armor extends Artifact {

    private int defense;

    public Armor(String name, int defense) {
        super(name);
        this.type = EArtifact.ARMOR;
        this.defense = defense;
    }
}
