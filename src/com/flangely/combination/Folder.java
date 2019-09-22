package com.flangely.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @program design-pattern
 * @description: 文件夹
 * @author: flangely
 * @create: 2019/09/22 09:21
 */
public class Folder extends Node {

    //文件夹可以包含子节点（文件夹或者文件）。
    private List<Node> childNodeList = new ArrayList<>();

    //调用父类“节点”的构造方法命名。
    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        childNodeList.add(child);//可以添加子节点
    }

    @Override
    public void ls(int space) {
        super.ls(space);//调用父类共通的ls方法列出自己的名字。
        space++;//之后列出的子节点前，空格数要增加一个了。
        for (Node node : childNodeList) {
            node.ls(space);//调用子节点的ls方法。
        }
    }
}