package com.flangely.prototype;

/**
 * @program design-pattern
 * @description: 子弹类
 * @author: flangely
 * @create: 2019/09/12 23:12
 */
public class Bullet implements Cloneable{

    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet)super.clone();
    }
}