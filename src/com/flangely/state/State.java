package com.flangely.state;

/**
 * @program design-pattern
 * @description: 状态接口
 * @author: flangely
 * @create: 2019/09/13 13:03
 */
public interface State {

    public void switchOn(Switcher switcher);

    public void switchOff(Switcher switcher);
}