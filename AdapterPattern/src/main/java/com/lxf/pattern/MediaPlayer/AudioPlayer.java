/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.MediaPlayer;


/**
 * <pre>
 * @FileName:    AudioPlayer
 * @Author:      李晓福
 * @Date:        2018/12/14 0:25
 * @Description: AudioPlayer
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 0:25     1.0.0           创建
 * </pre>
 */
 
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    public void setMediaAdapter(MediaAdapter mediaAdapter) {
        this.mediaAdapter = mediaAdapter;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (MediaPlayer.MP3_TYPE.equals(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (AdvancedMediaPlayer.VLC_TYPE.equals(audioType) || AdvancedMediaPlayer.MP4_TYPE.equals(audioType)) {
            this.mediaAdapter = new MediaAdapter(audioType);
            this.mediaAdapter.play(audioType, fileName);
        } else {
            throw new IllegalArgumentException("Invalid media. " + audioType + " format not supported");
        }
    }
}
