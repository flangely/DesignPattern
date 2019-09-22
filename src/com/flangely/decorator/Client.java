package com.flangely.decorator;

/**
 * @program design-pattern
 * @description:
 * @author: flangely
 * @create: 2019/09/22 09:09
 */
public class Client {

    public static void main(String[] args) {
        Showable madeupGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeupGirl.show();
    }
}