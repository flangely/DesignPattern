package com.flangely.prototype;

public class EnemyPlane implements Cloneable{


    private Bullet bullet = new Bullet();

    private int x;//敌人横坐标

    private int y = 0;//敌人纵坐标

    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    //此处开放setX，为了让克隆后的实例重新修改x坐标
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public void fly(){
        y++;//让敌机飞
    }

    /**
     * 克隆方法重写我们调用了父类Object的克隆方法，这里JVM会进行内存操作直接拷贝原始数据流
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane clonePlane = (EnemyPlane) super.clone();//先克隆出敌机，其中子弹还未进行克隆。
        clonePlane.setBullet(this.bullet.clone());//对子弹进行深拷贝
        return clonePlane;
    }
}
