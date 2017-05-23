package fr._42.swingy;

import fr._42.swingy.Utility.Logger;
import fr._42.swingy.view.cli.CliView;
import fr._42.swingy.view.gui.GuiView;

import static fr._42.swingy.Utility.Global.*;

/**
 * Created by hivian on 4/18/17.
 */
public class Main {
    public static void main(String[] arg) {
        try {
            if (arg[0].equals("console")) {
                Logger.print(ANSI_CYAN + "Welcome to \"42 RPG\"" + ANSI_RESET);
                CliView.run();
            }
            if (arg[0].equals("gui")) {
                GuiView.run();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.print("Select console or gui");
        }
    }
}
