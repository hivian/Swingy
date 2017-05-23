package fr._42.swingy.model.artifacts;

import fr._42.swingy.Utility.EArtifact;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by hivian on 5/4/17.
 */
@Getter
public abstract class Artifact implements Serializable {

    String name;
    EArtifact type;

    Artifact(String name) {
        this.name = name;
    }
}
