/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.util;
    


/**
 * <pre>
 * @FileName:    Observer
 * @Author:      李晓福
 * @Date:        2018/12/16 12:37
 * @Description: 观察者
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/16 12:37     1.0.0           创建
 * </pre>
 */
 
public interface Observer {

    /**
     * <pre>
     * @Author      lxf
     * @Description 更新观察者
     * @Date        2018/12/16
     * @MethdName   update
     * @Param       [observable, arg]
     * @return      void
     * </pre>
     */
    void update(Observable observable,Object arg);
}
