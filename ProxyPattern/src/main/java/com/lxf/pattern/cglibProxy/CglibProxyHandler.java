/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.cglibProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <pre>
 * @FileName:    CglibProxyHandler
 * @Author:      李晓福
 * @Date:        2018/12/14 17:02
 * @Description: cglib动态代理处理器
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 17:02     1.0.0           创建
 * </pre>
 */
 
public class CglibProxyHandler implements MethodInterceptor {

    private Object target;

    public Object getProxyInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        // 将被代理的对象设置成父类
        enhancer.setSuperclass(this.target.getClass());
        // 设置回调类进行拦截
        enhancer.setCallback(this);
        // 创建一个代理类
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理谈出场费");
        // 明星出场唱歌
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("代理收出场费");
        return object;
    }
}
