package com.flangely.state;

/**
 * @program design-pattern
 * @description: 关闭开关
 * @author: flangely
 * @create: 2019/09/15 10:51
 */
public class Off implements State {
    @Override
    public void switchOn(Switcher switcher) {
        switcher.setState(new On());
        System.out.println("OK!!!灯亮");
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("WARN!!!关闭状态无需再关");
    }
}