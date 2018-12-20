/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.staticProxy;


/**
 * <pre>
 * @FileName:    RealStar
 * @Author:      李晓福
 * @Date:        2018/12/14 16:23
 * @Description: 真实明星
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 16:23     1.0.0           创建
 * </pre>
 */
 
public class RealStar implements Star{
    @Override
    public void sing() {
        System.out.println("明星唱歌");
    }
}
