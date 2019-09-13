package com.flangely.strategy;

/**
 * @program design-pattern
 * @description: 计算器
 * @author: flangely
 * @create: 2019/09/13 12:24
 */
public class Caculator {

    private Strategy strategy;//拥有某种策略

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int a, int b){
        return strategy.caculate(a, b);//返回具体策略的结果
    }
}