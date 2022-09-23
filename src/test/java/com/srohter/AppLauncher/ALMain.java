package com.srohter.AppLauncher;

import com.srohter.AppLauncher.GUI.App;

import javax.swing.*;

/**
 * @author Skylar Rohter
 */
public class ALMain {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        App frame = new App();
        frame.setVisible(true);
    }
}
