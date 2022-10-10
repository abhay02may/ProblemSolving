package com.datastructure.tree.normal;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> childrens;

    public TreeNode(String data){
        this.data=data;
        this.childrens=new ArrayList<>();
    }

    public void addChildren(TreeNode node){
        this.childrens.add(node);
    }

    public String print(int level){
        String ret="";
        ret="  ".repeat(level)+data+"\n";
        for(TreeNode node:this.childrens){
            ret+=node.print(level+1);
        }
        return ret;
    }
}
