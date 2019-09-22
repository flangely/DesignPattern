package com.flangely.decorator;

/**
 * @program design-pattern
 * @description: 打粉底
 * @author: flangely
 * @create: 2019/09/22 09:05
 */
public class FoundationMakeup extends Decorator {

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底(");
        showable.show();
        System.out.print(")");
    }
}