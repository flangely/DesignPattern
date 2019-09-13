package com.flangely.strategy;

/**
 * @program design-pattern
 * @description: 减法
 * @author: flangely
 * @create: 2019/09/13 12:24
 */
public class Subtraction implements Strategy {

    @Override
    public int caculate(int a, int b) {
        return a - b;
    }
}