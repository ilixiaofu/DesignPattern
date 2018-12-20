/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.chakong;


/**
 * <pre>
 * @FileName:    DefaultTriplePinHandler
 * @Author:      李晓福
 * @Date:        2018/12/14 15:41
 * @Description: 默认三项插孔插头处理器
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 15:41     1.0.0           创建
 * </pre>
 */
 
public class DefaultTriplePinHandler implements TriplePin
{
    private DualPinAdapter dualPinAdapter;

    public void setDualPinAdapter(DualPinAdapter dualPinAdapter) {
        this.dualPinAdapter = dualPinAdapter;
    }

    @Override
    public void ecectrify(int liveWire, int nullWire, int groundWire) {
        if (groundWire == 0) {
            try {
                dualPinAdapter.ecectrify(liveWire, nullWire, groundWire);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("请使用转接头连接");
            }
        } else if (groundWire == 1) {
            System.out.println("火线通电：" + liveWire);
            System.out.println("零线通电：" + nullWire);
            System.out.println("地线通电：" + groundWire);
        }
    }
}
