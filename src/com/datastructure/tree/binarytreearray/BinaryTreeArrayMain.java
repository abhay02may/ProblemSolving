package com.datastructure.tree.binarytreearray;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree(9);
        binaryTree.insertNode("N1");
        binaryTree.insertNode("N2");
        binaryTree.insertNode("N3");
        binaryTree.insertNode("N4");
        binaryTree.insertNode("N5");
        binaryTree.insertNode("N6");
        binaryTree.insertNode("N7");
        binaryTree.insertNode("N8");
        binaryTree.insertNode("N9");
        System.out.println("\n Calling preOrderTraversal");
        binaryTree.preOrderTraversal(1);
        System.out.println("\n Calling inOrderTraversal");
        binaryTree.inOrderTraversal(1);
        System.out.println("\n Calling postOrderTraversal");
        binaryTree.postOrderTraversal(1);
        System.out.println("\n Calling orderLevelTraversal");
        binaryTree.orderLevelTraversal();
        binaryTree.search("N18");
        binaryTree.deleteNode("N3");
        binaryTree.orderLevelTraversal();


    }
}
