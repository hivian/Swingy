package fr._42.swingy.model.artifacts;


import fr._42.swingy.Utility.EArtifact;
import lombok.Getter;

/**
 * Created by hivian on 4/20/17.
 */
@Getter
public class Helm extends Artifact {
    private int hp;

    public Helm(String name, int hp) {
        super(name);
        this.type = EArtifact.HELM;
        this.hp = hp;
    }
}
