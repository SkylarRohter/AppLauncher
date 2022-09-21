package com.srohter.AppLauncher.Apps;

import com.srohter.AppLauncher.Utility.CheckOS;

public class Mail {
    public void openMail(){
        try {
            Runtime runtime = Runtime.getRuntime();
            String[] win = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://outlook.office.com/mail/"};
            String[] mac = {"/usr/bin/open", "-a", "/Applications/Google Chrome.app", "https://outlook.office.com/mail/"};
            String os = new CheckOS().getOs();
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
