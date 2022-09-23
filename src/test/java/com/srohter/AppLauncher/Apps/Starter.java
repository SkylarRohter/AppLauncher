package com.srohter.AppLauncher.Apps;

import com.srohter.AppLauncher.GUI.App;
import com.srohter.AppLauncher.Utility.CheckTick;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Starter {
    public Starter(ArrayList<Boolean> list) {
        this.list = list;
    }
    public ArrayList<Boolean> list;
    public void makeStarter(){
        App app = new App();
        
        ArrayList<String> runnables = new ArrayList<>();
        runnables.add("https://www.google.com");
        runnables.add("https://outlook.office.com/mail/");
        runnables.add("https://www.office.com/launch/word?auth=2");
        runnables.add("https://waprep.getalma.com");
        for(int i = 0;i < list.size(); i++) {
            runTick(list.get(i),runnables.get(i));
        }
    }
    private void runTick(boolean b, String runnable){
        Runtime runtime = Runtime.getRuntime();
        String[] runList = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",runnable};
        if(b){
            try {
                runtime.exec(runList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
