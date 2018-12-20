/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.chakong;
    


/**
 * <pre>
 * @FileName:    TriplePin
 * @Author:      李晓福
 * @Date:        2018/12/14 15:13
 * @Description: 三项插孔接口
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 15:13     1.0.0           创建
 * </pre>
 */
 
public interface TriplePin {

    /**
     * <pre>
     * @Author      lxf
     * @Description 三插孔标准通电方法
     * @Date        2018/12/14
     * @MethdName   ecectrify
     * @Param       [liveWire, nullWire, groundWire]
     * @return      void
     * </pre>
     */
    void ecectrify(int liveWire, int nullWire, int groundWire);
}
