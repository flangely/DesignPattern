package com.flangely.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) throws Exception{
        List<EnemyPlane> enemyPlanes = new ArrayList<EnemyPlane>();
        long newStart = System.currentTimeMillis();
        //new对象
        for (int i = 0; i < 1000000000; i++){
            //此处随机位置产生敌机
            EnemyPlane ep = new EnemyPlane(new Random().nextInt());
        }
        long newTime = System.currentTimeMillis() - newStart;
        System.out.printf("实例化对象花费时间:" + String.valueOf(newTime) + "ms");
        //克隆对象
        long cloneStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++){
            EnemyPlaneFactory.getInstance(new Random().nextInt());
        }
        long cloneTime = System.currentTimeMillis() - cloneStart;
        System.out.printf("克隆对象花费时间:" + String.valueOf(cloneTime) + "ms");
    }
}
