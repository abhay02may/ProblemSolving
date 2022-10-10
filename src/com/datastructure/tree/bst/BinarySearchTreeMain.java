package com.datastructure.tree.bst;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insertNode(70);
        bst.insertNode(50);
        bst.insertNode(90);
        bst.insertNode(30);
        bst.insertNode(60);
        bst.insertNode(80);
        bst.insertNode(100);
        bst.insertNode(20);
        bst.insertNode(40);
        System.out.println("\n Pre Order Traversal ");
        bst.preOrderTraversal(bst.root);
        System.out.println("\n In Order Traversal ");
        bst.inOrderTraversal(bst.root);
        System.out.println("\n Post Order Traversal ");
        bst.postOrderTraversal(bst.root);
        System.out.println("\n Level Order Traversal ");
        bst.levelOrderTraversal();
        System.out.println("\n Search in BST ");
        bst.search(bst.root,100);
        bst.levelOrderTraversal();
        System.out.println();
        bst.deleteNode(bst.root,90);
        bst.levelOrderTraversal();




    }
}
