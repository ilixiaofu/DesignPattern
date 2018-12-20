/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.staticProxy;


/**
 * <pre>
 * @FileName:    ProxyStar
 * @Author:      李晓福
 * @Date:        2018/12/14 16:30
 * @Description: 明星的静态代理
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 16:30     1.0.0           创建
 * </pre>
 */
 
public class ProxyStar implements Star{

    private Star realSatr;

    public ProxyStar(Star realSatr) {
        this.realSatr = realSatr;
    }

    @Override
    public void sing() {
        System.out.println("代理谈出场费");
        // 明星出场唱歌
        this.realSatr.sing();
        System.out.println("代理收出场费");
    }
}
