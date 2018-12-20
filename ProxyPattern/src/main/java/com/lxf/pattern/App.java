package com.lxf.pattern;

import com.lxf.pattern.cglibProxy.CglibProxyHandler;
import com.lxf.pattern.dynamicProxy.JdkProxyHandler;
import com.lxf.pattern.staticProxy.RealStar;
import com.lxf.pattern.staticProxy.Star;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Star star = new ProxyStar(new RealStar());
//        star.sing();

        Star star = (Star) new JdkProxyHandler().getProxyInstance(new RealStar());
        star.sing();

//        Star star = (Star) new CglibProxyHandler().getProxyInstance(new RealStar());
//        star.sing();
    }
}
