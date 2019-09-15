package com.flangely.templatemethod;

/**
 * @program design-pattern
 * @description: 哺乳动物抽象
 * @author: flangely
 * @create: 2019/09/15 11:25
 */
public abstract class Mammal {

    private boolean female = true;

    //既然是哺乳动物当然会喂奶了，但这里约束为只能母的喂奶
    protected final void feedMilk(){
        if (female){
            System.out.println("喂奶");
        }else {
            System.out.println("公的不会");
        }
    }

    //哺乳动物当然可以移动，但具体怎么移动还不知道。
    public abstract void move();

}