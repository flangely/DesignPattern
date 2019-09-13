package com.flangely.adaptor;

/**
 * @program design-pattern
 * @description: 电视机通电
 * @author: flangely
 * @create: 2019/09/13 10:46
 */
public class TV implements DualPin {

    @Override
    public void electrify(int l, int e) {
        System.out.printf("火线通电:" + l);
        System.out.printf("零线通电" + e);
    }
}