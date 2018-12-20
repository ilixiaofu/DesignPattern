/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.chakong;


/**
 * <pre>
 * @FileName:    TV
 * @Author:      李晓福
 * @Date:        2018/12/14 15:27
 * @Description: 电视机插头
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 15:27     1.0.0           创建
 * </pre>
 */
 
public class TV implements DualPin{

    @Override
    public void ecectrify(int liveWire, int nullWire) {
        System.out.println("火线通电：" + liveWire);
        System.out.println("零线通电：" + nullWire);
    }
}
