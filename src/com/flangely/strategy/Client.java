package com.flangely.strategy;

import java.nio.channels.SelectionKey;

/**
 * @program design-pattern
 * @description: 客户端
 * @author: flangely
 * @create: 2019/09/13 12:29
 */
public class Client {

    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        caculator.setStrategy(new Addition());//插入加法策略
        System.out.println(String.valueOf(caculator.getResult(1, 1)));
        caculator.setStrategy(new Subtraction());//插入减法策略
        System.out.println(String.valueOf(caculator.getResult(5, 3)));
        System.out.println(SelectionKey.OP_ACCEPT);
        System.out.println(SelectionKey.OP_CONNECT);
    }
}