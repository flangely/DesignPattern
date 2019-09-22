package com.flangely.decorator;

/**
 * @program design-pattern
 * @description: 女孩
 * @author: flangely
 * @create: 2019/09/22 09:01
 */
public class Girl implements Showable {
    @Override
    public void show() {
        System.out.print("女孩的素颜");
    }
}