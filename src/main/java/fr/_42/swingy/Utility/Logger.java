package fr._42.swingy.Utility;


import static fr._42.swingy.Utility.Global.bIsGUI;

/**
 * Created by hivian on 5/11/17.
 */
public class Logger {

    static public void print(String content) {
        if (!bIsGUI) {
            System.out.println(content);
        } else {
            if (!Global.bFightPhase) {
                Global.logTextArea.setText(content + "\n");
            } else {
                Global.logTextArea.append(content + "\n");
            }
        }
    }
}
