package com.srohter.AppLauncher.Apps;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Alma {
    public void openAlma(){
        try {
            Runtime runtime = Runtime.getRuntime();
            Robot r = new Robot();
            String[] s = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://waprep.getalma.com"};
            runtime.exec(s);
            Thread.sleep(2000);
            r.mouseMove(-964,480);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
