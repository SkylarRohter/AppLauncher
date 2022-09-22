package com.srohter.AppLauncher.Apps;

import com.srohter.AppLauncher.Utility.CheckTick;

import java.awt.*;

public class Starter {
    public void starter(){
        //runTick()
    }
    private void runTick(Checkbox c, String runnable){
        CheckTick tickCheck = new CheckTick(c);
        Runtime runtime = Runtime.getRuntime();
        if(tickCheck.check()){

        }
    }
}
