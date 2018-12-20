/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.chakong;
    


/**
 * <pre>
 * @FileName:    DualPin
 * @Author:      李晓福
 * @Date:        2018/12/14 15:24
 * @Description: 两项插孔接口
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 15:24     1.0.0           创建
 * </pre>
 */
 
public interface DualPin {
    /**
     * <pre>
     * @Author      lxf
     * @Description TODO
     * @Date        2018/12/14
     * @MethdName   ecectrify
     * @Param       [liveWire, nullWire]
     * @return      void
     * </pre>
     */
    void ecectrify(int liveWire, int nullWire);
}
