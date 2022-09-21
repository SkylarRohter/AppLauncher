package com.srohter.AppLauncher.Utility;

public class CheckOS {
    public String getOs(){
        String os = System.getProperty("os.name");
        return os;
    }
}
