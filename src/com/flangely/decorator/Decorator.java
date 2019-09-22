package com.flangely.decorator;

/**
 * @program design-pattern
 * @description: 装饰器
 * @author: flangely
 * @create: 2019/09/22 09:02
 */
public abstract class Decorator implements Showable{

    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}