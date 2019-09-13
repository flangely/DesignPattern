package com.flangely.adaptor;

/**
 * @program design-pattern
 * @description: 双项插孔
 * @author: flangely
 * @create: 2019/09/13 10:44
 */
public interface DualPin {

    //火线、零线
    public void electrify(int l, int e);

}