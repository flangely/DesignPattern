package com.flangely.prototype;

/**
 * @program design-pattern
 * @description: 飞机工厂
 * @author: flangely
 * @create: 2019/09/12 22:56
 */
public class EnemyPlaneFactory {

    //此处用痴汉模式造一个敌机原型
    private static EnemyPlane prototype = new EnemyPlane(200);

    //获取敌机克隆实例
    public static EnemyPlane getInstance(int x) throws Exception{
        EnemyPlane enemyPlane = prototype.clone();
        enemyPlane.setX(x);
        return enemyPlane;
    }

}