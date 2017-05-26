package fr._42.swingy.Utility;

import fr._42.swingy.model.artifacts.Artifact;
import fr._42.swingy.model.characters.Foe;
import fr._42.swingy.model.characters.Hero;
import fr._42.swingy.view.SquareMap;

import javax.swing.*;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

/**
 * Created by hivian on 4/28/17.
 */
public class Global {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static ValidatorFactory factory;
    public static Boolean bIsHero = false;
    public static Boolean bLootChoice = false;
    public static Boolean bFightPhase = false;
    public static Boolean bEncounterPhase = false;
    public static Boolean bIsGUI = false;
    public static JTextArea logTextArea;
    public static int nbHero = 0;
    public static Hero hero;
    public static Foe foe;
    public static Artifact artifact;
    public static SquareMap squareMap;
}
