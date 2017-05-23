package fr._42.swingy.controller;

import fr._42.swingy.Utility.EType;
import fr._42.swingy.Utility.Logger;
import fr._42.swingy.model.characters.*;
import fr._42.swingy.model.characters.Character;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

import static fr._42.swingy.Utility.Global.factory;

/**
 * Created by hivian on 4/27/17.
 */
public abstract class CharacterFactory {

    private static Character character;

    public static Character newHero(String name, EType type) {
        switch (type) {
            case WARRIOR:
                character = new Warrior(name);
                break;
            case THIEF:
                character = new Thief(name);
                break;
            case WIZARD:
                character = new Wizard(name);
                break;
        }
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Character>> constraintViolations = validator.validate(character);
        if (constraintViolations.size() > 0 ) {
            for (ConstraintViolation<Character> constraints : constraintViolations) {
                Logger.print(constraints.getRootBeanClass().getSimpleName()+
                        "." + constraints.getPropertyPath() + " " + constraints.getMessage());
            }
            return (null);
        }
        else {
            return (character);
        }
    }

    static Character newFoe(EType type, Character hero) {
        switch (type) {
            case RAT:
                character = new Rat(hero.getLevel());
                break;
            case BAT:
                character = new Bat(hero.getLevel());
                break;
        }
        return (character);
    }
}
