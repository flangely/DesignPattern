package com.flangely.state;

/**
 * @program design-pattern
 * @description: 开关
 * @author: flangely
 * @create: 2019/09/13 13:04
 */
public class Switcher {
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchOn(){
        state.switchOn(this);
    }

    public void switchOff(){
        state.switchOff(this);
    }
}