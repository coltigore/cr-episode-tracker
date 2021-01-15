package com.coltigore;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        File Ding = new File("Ding.WAV");
        PlaySound(Ding);
    }
    static void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        }catch (Exception e)
    }
}
