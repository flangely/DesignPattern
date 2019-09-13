package com.flangely.adaptor;

/**
 * @program design-pattern
 * @description: 三项插孔
 * @author: flangely
 * @create: 2019/09/13 10:42
 */
public interface TriplePin {

    //参数分别为火线live，零线null，地线earth
    public void electrify(int l, int n, int e);
}