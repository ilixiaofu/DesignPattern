/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.MediaPlayer;


import java.util.PrimitiveIterator;

/**
 * <pre>
 * @FileName:    MediaPlayer
 * @Author:      李晓福
 * @Date:        2018/12/13 23:57
 * @Description: MediaPlayer
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/13 23:57     1.0.0           创建
 * </pre>
 */
 
public interface MediaPlayer {
    String MP3_TYPE = "mp3";
    void play(String audioType, String fileName);
}
