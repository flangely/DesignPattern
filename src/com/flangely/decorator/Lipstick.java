package com.flangely.decorator;

/**
 * @program design-pattern
 * @description: 涂口红
 * @author: flangely
 * @create: 2019/09/22 09:07
 */
public class Lipstick extends Decorator {
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("(涂口红");
        showable.show();
        System.out.print(")");
    }
}