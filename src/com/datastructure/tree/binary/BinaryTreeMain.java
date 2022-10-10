package com.datastructure.tree.binary;


public class BinaryTreeMain {
    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
       /* BinaryNode N1=new BinaryNode();
        N1.value="N1";
        BinaryNode N2=new BinaryNode();
        N2.value="N2";
        BinaryNode N3=new BinaryNode();
        N3.value="N3";
        BinaryNode N4=new BinaryNode();
        N4.value="N4";
        BinaryNode N5=new BinaryNode();
        N5.value="N5";
        BinaryNode N6=new BinaryNode();
        N6.value="N6";
        BinaryNode N7=new BinaryNode();
        N7.value="N7";
        BinaryNode N8=new BinaryNode();
        N8.value="N8";
        BinaryNode N9=new BinaryNode();
        N9.value="N9";

        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N5;
        N3.left=N6;
        N3.right=N7;
        N4.left=N8;
        N4.right=N9;

        binaryTree.root=N1;*/
        binaryTree.insertNode("N1");
        binaryTree.insertNode("N2");
        binaryTree.insertNode("N3");
        binaryTree.insertNode("N4");
        binaryTree.insertNode("N5");
        binaryTree.insertNode("N6");

       /* System.out.println("\n PreOrder Traversal");
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println();
        System.out.println("\n InOrder Traversal");
        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println();
        System.out.println("\n PostOrder Traversal");
        binaryTree.postOrderTraversal(binaryTree.root);
        System.out.println();*/
        System.out.println("\n LevelOrder Traversal");
        binaryTree.levelOrderTraversal();
        System.out.println("\n");
        binaryTree.searchNode("N5");
        //System.out.println(binaryTree.getDeepestNode().value);
        binaryTree.deleteNode("N3");
        binaryTree.levelOrderTraversal();


    }
}
