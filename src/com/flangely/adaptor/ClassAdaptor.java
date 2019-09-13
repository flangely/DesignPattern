package com.flangely.adaptor;

/**
 * @program design-pattern
 * @description: 类适配器
 * @author: flangely
 * @create: 2019/09/13 10:52
 */
public class ClassAdaptor extends TV implements TriplePin {
    @Override
    public void electrify(int l, int n, int e) {

        super.electrify(l, e);
    }
}