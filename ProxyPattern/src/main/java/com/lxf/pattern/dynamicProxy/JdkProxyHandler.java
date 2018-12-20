/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.dynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <pre>
 * @FileName: JdkProxyHandler
 * @Author: 李晓福
 * @Date: 2018/12/14 16:42
 * @Description: 动态代理处理器
 * @since: 1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/14 16:42     1.0.0           创建
 * </pre>
 */

public class JdkProxyHandler implements InvocationHandler {

    private Object target;

    public Object getProxyInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理谈出场费");
        // 明星出场唱歌
        Object object = method.invoke(this.target, args);
        System.out.println("代理收出场费");
        return object;
    }
}
