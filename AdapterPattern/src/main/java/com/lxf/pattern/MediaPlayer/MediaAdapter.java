/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.MediaPlayer;


/**
 * <pre>
 * @FileName: MediaAdapter
 * @Author: 李晓福
 * @Date: 2018/12/14 0:05
 * @Description: MediaAdapter
 * @since: 1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 0:05     1.0.0           创建
 * </pre>
 */

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer mAdvancedMediaPlayer;

    public MediaAdapter(String audioType) {
        try {
            if (AdvancedMediaPlayer.VLC_TYPE.equals(audioType)) {
                this.mAdvancedMediaPlayer = (AdvancedMediaPlayer) Class.forName("com.lxf.pattern.MediaPlayer.VlcPlayer").newInstance();
            } else if (AdvancedMediaPlayer.MP4_TYPE.equals(audioType)) {
                this.mAdvancedMediaPlayer = (AdvancedMediaPlayer) Class.forName("com.lxf.pattern.MediaPlayer.Mp4Player").newInstance();
            } else {
                throw new IllegalArgumentException("参数不正确");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void play(String audioType, String fileName) {
        if (AdvancedMediaPlayer.VLC_TYPE.equals(audioType)) {
            this.mAdvancedMediaPlayer.playVlc(fileName);
        } else if (AdvancedMediaPlayer.MP4_TYPE.equals(audioType)) {
            this.mAdvancedMediaPlayer.playMp4(fileName);
        } else {
            throw new IllegalArgumentException("参数不正确");
        }
    }
}
