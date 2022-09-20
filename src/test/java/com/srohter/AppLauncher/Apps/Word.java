package com.srohter.AppLauncher.Apps;

import java.awt.*;
import java.awt.event.InputEvent;

public class Word {
    public void openWord(){
        try {
            Runtime runtime = Runtime.getRuntime();
            Robot r = new Robot();
            String[] win = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.office.com/launch/word?auth=2"};
            String[] mac = {"/usr/bin/open", "-a", "/Applications/Google Chrome.app", "https://www.office.com/launch/word?auth=2"};
            String os = System.getProperty("os.name");
            if(os.contains("Mac")){
                runtime.exec(mac);
            }else if(os.contains("Win")){
                runtime.exec(win);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
