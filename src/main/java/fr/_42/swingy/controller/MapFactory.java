package fr._42.swingy.controller;

import fr._42.swingy.Utility.Logger;
import fr._42.swingy.model.characters.Character;
import fr._42.swingy.view.SquareMap;

/**
 * Created by hivian on 5/3/17.
 */
public class MapFactory {

    public static SquareMap generateMap(Character hero) {
        int mapSize = (hero.getLevel() - 1) * 5 + 10 - (hero.getLevel() % 2);

        if (mapSize > 19) {
            mapSize = 19;
        }
        SquareMap squareMap = new SquareMap(mapSize);
        squareMap.registerHero(hero);
        Logger.print(hero.getName() + " arrived in a new hostile environment");
        squareMap.generateFoes();
        return (squareMap);
    }
}
