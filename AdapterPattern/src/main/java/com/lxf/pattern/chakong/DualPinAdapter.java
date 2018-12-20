/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.chakong;


/**
 * <pre>
 * @FileName:    DualPinAdapter
 * @Author:      李晓福
 * @Date:        2018/12/14 15:30
 * @Description: 两孔插头转接头适配器
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 15:30     1.0.0           创建
 * </pre>
 */
 
public class DualPinAdapter implements TriplePin{

    private DualPin dualPin;

    public DualPinAdapter(DualPin dualPin) {
        this.dualPin = dualPin;
    }

    @Override
    public void ecectrify(int liveWire, int nullWire, int groundWire) {
        dualPin.ecectrify(liveWire, nullWire);
    }
}
