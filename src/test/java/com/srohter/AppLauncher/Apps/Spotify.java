package com.srohter.AppLauncher.Apps;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.HashMap;

/**
 * @author Skylar Rohter
 */
public class Spotify {
    public String songName;
    public int volume;

    public Spotify(String songName, int volume) {
        this.songName = songName;
        this.volume = volume;
    }

    public void openSpotify(){
        try {
            Robot mark = new Robot(); //Bar Y = 932
            int vMin = 3700, vMax = 3792; //1
            int suckMyFatBalls;
            HashMap<Integer, Integer> values = new HashMap<>();
            for(int i = 0;i <= 92;i++){
                suckMyFatBalls = vMin + i;
                values.put(i,suckMyFatBalls);
            }
            mark.mouseMove(values.get(volume),932);
            mark.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            mark.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }catch(AWTException e){
            e.printStackTrace();
        }catch(NullPointerException p){
        }
    }
}
