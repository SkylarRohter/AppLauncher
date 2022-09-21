package com.srohter.AppLauncher.Apps;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Skylar Rohter
 * @see #openSpotify()
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
            Robot mark = new Robot();
            //setVolume(mark);
            setSong(mark);

        }catch(AWTException e) {
            e.printStackTrace();
        }
    }
    private void setVolume(Robot mark){
        try {
            int vMin = 3700; //1
            int suckMyFatBalls;
            HashMap<Integer, Integer> values = new HashMap<>();
            for (int i = 0; i <= 92; i++) {
                suckMyFatBalls = vMin + i;
                values.put(i, suckMyFatBalls);
            }
            mark.mouseMove(values.get(volume), 932);
            mark.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            mark.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }catch(NullPointerException p){
            //TODO does nothing
        }
    }
    private void setSong(Robot mark)throws AWTException{
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < songName.length(); i++) {
            letters.add(songName.charAt(i));
            int keyCode = java.awt.event.KeyEvent.getExtendedKeyCodeForChar(letters.get(i));
            mark.keyPress(keyCode);
            mark.keyRelease(keyCode);
        }
    }
}
