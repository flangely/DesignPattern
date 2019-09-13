package com.flangely.adaptor;

/**
 * @program design-pattern
 * @description: 电源插头适配器(对象适配器)
 * @author: flangely
 * @create: 2019/09/13 10:48
 */
public class Adaptor implements TriplePin {

    private DualPin dualPin;

    //创建适配器地时候，需要把双插设备接入进来
    public Adaptor(DualPin dualPin) {
        this.dualPin = dualPin;
    }


    @Override
    public void electrify(int l, int n, int e) {
        //实际上调用了被适配设备的双插通电，地线e被丢弃了。
        dualPin.electrify(l, e);
    }
}