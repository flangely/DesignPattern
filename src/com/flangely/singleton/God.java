package com.flangely.singleton;

/**
 * @program design-pattern
 * @description: 上帝
 * @author: flangely
 * @create: 2019/09/13 09:51
 */
public class God {

    private static final God god = new God();//自有永有的神单例(痴汉单例)

    private static volatile God god2;//(懒汉单例)

    private God() {//构造方法私有化
    }

    public static God getInstance(){//请神方法公开化
        return god;
    }


    public static God getInstance2() {//庙是开放的不用排队进入
        if (god2 == null) {//如果头柱香未产生，这批抢香人进入堂内排队。
            synchronized(God.class){
                if (god2 == null) {//只有头香造了神，其他抢香的白排队了
                    god2 = new God();
                }
            }
        }
        //此处头柱香产生后不必再排队
        return god2;
    }
}