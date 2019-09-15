package com.flangely.templatemethod;

/**
 * @program design-pattern
 * @description: 人类
 * @author: flangely
 * @create: 2019/09/15 11:29
 */
public class Human extends Mammal {

    @Override
    public void move() {
        System.out.printf("两条腿走路");
    }
}