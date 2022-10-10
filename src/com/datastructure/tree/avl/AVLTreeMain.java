package com.datastructure.tree.avl;

public class AVLTreeMain {
    public static void main(String[] args) {
        AVLTree avlTree=new AVLTree();
        avlTree.insertNode(5);
        avlTree.insertNode(10);
        avlTree.insertNode(15);
        avlTree.insertNode(20);
        avlTree.levelOrderTraversal();
        avlTree.deleteNode(5);
        System.out.println();
        avlTree.levelOrderTraversal();

    }
}
