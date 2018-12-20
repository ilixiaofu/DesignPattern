/**
 * Copyright (C), 2015-2018, XXX有限公司
 */
package com.lxf.pattern.util;


import java.util.Vector;

/**
 * <pre>
 * @FileName:    Observable
 * @Author:      李晓福
 * @Date:        2018/12/16 12:40
 * @Description: 被观察者：被观察的对象，如果该对象发生某些变化则通知观察者执行对应的操。
 * @since:       1.0.0
 * @History:
 * 作者姓名       修改时间             版本号           描述
 * lxf           2018/12/16 12:40     1.0.0           创建
 * </pre>
 */
 
public class Observable {

    private boolean changed = false;
    // 观察者集合
    private Vector<Observer> observers;

    public Observable() {
        this.observers = new Vector<>();
    }

    /**
     * <pre>
     * @Author      lxf
     * @Description 添加观察者
     * @Date        2018/12/16
     * @MethdName   addObserver
     * @Param       [observer]
     * @return      void
     * </pre>
     */
    public synchronized void addObserver(Observer observer) {
        // 参数为空抛出空指针异常
        if (observer == null)
            throw new NullPointerException();
        // 检查是否已经存在集合中
        if (!observers.contains(observer)) {
            observers.addElement(observer);
        }
    }

    /**
     * <pre>
     * @Author      lxf
     * @Description 移除观察者
     * @Date        2018/12/16
     * @MethdName   deleteObserver
     * @Param       [observer]
     * @return      void
     * </pre>
     */
    public synchronized void deleteObserver(Observer observer) {
        observers.removeElement(observer);
    }

    public synchronized void deleteObservers() {
        observers.removeAllElements();
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    protected void setUnChanged(boolean unChanged) {
        this.changed = unChanged;
    }

    public synchronized boolean hasChanged() {
        return this.changed;
    }

    public synchronized int countObservers() {
        return observers.size();
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        Object[] arrLocal;
        synchronized (this) {
            if (!changed)
                return;
            arrLocal = observers.toArray();
            setUnChanged(!changed);
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }
}
