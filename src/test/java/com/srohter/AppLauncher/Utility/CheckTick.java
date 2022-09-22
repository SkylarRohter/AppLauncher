package com.srohter.AppLauncher.Utility;

import java.awt.*;

public class CheckTick {
    public CheckTick(Checkbox checkbox) {
        this.checkbox = checkbox;
    }
    public Checkbox checkbox;
    public boolean check(){
        return (checkbox.getState());
    }
}
