package com.lxf.pattern;

import com.lxf.pattern.MediaPlayer.AudioPlayer;
import com.lxf.pattern.MediaPlayer.MediaAdapter;
import com.lxf.pattern.chakong.DefaultTriplePinHandler;
import com.lxf.pattern.chakong.DualPin;
import com.lxf.pattern.chakong.DualPinAdapter;
import com.lxf.pattern.chakong.TV;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play("mp3", "beyond the horizon.mp3");
//        audioPlayer.play("mp4", "alone.mp4");
//        audioPlayer.play("vlc", "far far away.vlc");
//        audioPlayer.play("avi", "mind me.avi");

        DefaultTriplePinHandler defaultTriplePinHandler = new DefaultTriplePinHandler();
        defaultTriplePinHandler.setDualPinAdapter(new DualPinAdapter(new TV()));
        defaultTriplePinHandler.ecectrify(1, 1, 0);
    }
}
