package fr._42.swingy;

import fr._42.swingy.Utility.Logger;
import fr._42.swingy.view.cli.CliView;
import fr._42.swingy.view.gui.GuiView;

import javax.validation.Validation;

import static fr._42.swingy.Utility.Global.*;

/**
 * Created by hivian on 4/18/17.
 */
public class Main {
    public static void main(String[] arg) {
        try {
            switch (arg[0]) {
                case "console":
                    Logger.print(ANSI_CYAN + "Welcome to \"42 RPG\"" + ANSI_RESET);
                    factory = Validation.buildDefaultValidatorFactory();
                    CliView.run();
                    break;
                case "gui":
                    factory = Validation.buildDefaultValidatorFactory();
                    GuiView.run();
                    break;
                default:
                    Logger.print("Usage: java -jar target/swingy [console/gui]");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.print("Usage: java -jar target/swingy [console/gui]");
        }
    }
}
