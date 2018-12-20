/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.MediaPlayer;


import java.security.PrivateKey;

/**
 * <pre>
 * @FileName:    AdvancedMediaPlayer
 * @Author:      李晓福
 * @Date:        2018/12/14 0:00
 * @Description: AdvancedMediaPlayer
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 0:00     1.0.0           创建
 * </pre>
 */
 
public interface AdvancedMediaPlayer {
    String VLC_TYPE = "vlc";
    String MP4_TYPE = "mp4";
    void playVlc(String fileName);
    void playMp4(String fileName);
}
