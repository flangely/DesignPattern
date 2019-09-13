package com.flangely.strategy;

/**
 * @program design-pattern
 * @description: 加法
 * @author: flangely
 * @create: 2019/09/13 12:23
 */
public class Addition implements Strategy{

    @Override
    public int caculate(int a, int b) {
        return a + b;
    }
}