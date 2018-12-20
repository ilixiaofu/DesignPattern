/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.MediaPlayer;


/**
 * <pre>
 * @FileName:    VlcPlayer
 * @Author:      李晓福
 * @Date:        2018/12/14 0:02
 * @Description: VlcPlayer 
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 0:02     1.0.0           创建
 * </pre>
 */
 
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
