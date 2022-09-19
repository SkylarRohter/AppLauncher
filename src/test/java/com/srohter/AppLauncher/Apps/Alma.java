package com.srohter.AppLauncher.Apps;

import org.junit.jupiter.api.DisplayName;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Alma {
    public void openAlma(){
        try {
            Runtime runtime = Runtime.getRuntime();
            Robot r = new Robot();
            String[] win = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://waprep.getalma.com"};
            String[] mac = {"/usr/bin/open", "-a", "/Applications/Google Chrome.app", "https://waprep.getalma.com"};
            String os = System.getProperty("os.name");
            if(os.contains("Mac")){
                runtime.exec(mac);
                Thread.sleep(3000);
                r.mouseMove(834,573);
                r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }else if(os.contains("Win")){
                runtime.exec(win);
                Thread.sleep(2000);
                r.mouseMove(-964,480);
                r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
