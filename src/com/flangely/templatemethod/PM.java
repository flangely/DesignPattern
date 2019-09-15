package com.flangely.templatemethod;

/**
 * @program design-pattern
 * @description: 项目管理
 * @author: flangely
 * @create: 2019/09/15 11:33
 */
public abstract class PM {
    protected abstract void analyze();//需求分析

    protected abstract void design();//设计

    protected abstract void develop();//开发

    protected abstract boolean test();//测试

    protected abstract void release();//发布

    protected final void kickoff() {
        analyze();
        design();
        do {
            develop();
        }while (!test());
        test();
        release();
    }
}