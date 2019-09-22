package com.flangely.combination;

/**
 * @program design-pattern
 * @description: 文件夹
 * @author: flangely
 * @create: 2019/09/22 09:23
 */
public class File extends Node {


    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        System.out.println("不能添加子节点");
    }

    @Override
    protected void ls(int space) {
        super.ls(space);
    }
}