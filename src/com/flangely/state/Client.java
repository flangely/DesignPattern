package com.flangely.state;

/**
 * @program design-pattern
 * @description: 客户端
 * @author: flangely
 * @create: 2019/09/15 11:02
 */
public class Client {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();

        switcher.switchOn();
        switcher.switchOn();
        switcher.switchOff();
        switcher.switchOff();
    }
}