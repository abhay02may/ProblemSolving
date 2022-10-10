package com.datastructure.tree.binarytreearray;

public class BinaryTree {
    String arr[];
    int lastUsedIndex;

    public BinaryTree(int size){
        arr=new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("Blank Binary Tree created with size :"+size);
    }

    public void insertNode(String value){
        if(!isFull()){
            arr[++lastUsedIndex]=value;
            System.out.println(value+" inserted at index "+lastUsedIndex);
            return;
        }else {
            System.out.println(" No space available for new Node");
        }
    }

    public boolean isFull(){
        if(lastUsedIndex==arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void preOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        preOrderTraversal(index*2);
        preOrderTraversal((index*2)+1);
    }

    public void inOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        inOrderTraversal(index *2);
        System.out.print(arr[index]+" ");
        inOrderTraversal(index*2 +1);
    }

    public void postOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        postOrderTraversal(index*2);
        postOrderTraversal(index*2+1);
        System.out.print(arr[index]+" ");
    }

    public void orderLevelTraversal(){
        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int search(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i].equals(value)){
                System.out.println("\n"+value+" found in the Binary Tree at location "+i);
                return i;
            }
        }
        System.out.println("\n"+value+" not found in the binary Tree !!!!");
        return -1;
    }

    public void deleteNode(String value){
        int location = search(value);
        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("\n" + value + " deleted from the Binary Tree !!!");
        }
    }

    public void deleteBinaryTree(){
        try{
                arr=null;
            System.out.println("\n Binary Tree deleted !!!!!");
        }catch (Exception e){
            System.out.println(" Error in deletion of binary tree!!!!!!");
        }
    }

}
