package com.srohter.AppLauncher;

import com.srohter.AppLauncher.GUI.App;
import de.javasoft.synthetica.dark.SyntheticaDarkLookAndFeel;

import javax.swing.*;
import java.text.ParseException;

/**
 * @author Skylar Rohter
 */
public class ALMain {
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new SyntheticaDarkLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        App frame = new App();
        frame.setVisible(true);
    }
}
