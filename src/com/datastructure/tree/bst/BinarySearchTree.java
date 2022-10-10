package com.datastructure.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public BinaryNode root;

    BinarySearchTree(){
        root=null;
    }

    public void insertNode(int value){
        insertNode(root,value);
    }

    public BinaryNode insertNode(BinaryNode currentNode,int value){
        if(currentNode==null){
            currentNode=new BinaryNode();
            currentNode.value=value;
            //System.out.println("Value Successfully inserted !!!!!");
            if(root==null){
                root=currentNode;
            }
            return currentNode;
        }else if(value<=currentNode.value){
            currentNode.left=insertNode(currentNode.left,value);
            return currentNode;
        }else{
            currentNode.right=insertNode(currentNode.right,value);
            return currentNode;
        }
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }

    public void levelOrderTraversal(){
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode search(BinaryNode node, int value){
        if(node==null){
            System.out.println(value+" not found in BST");
            return null;
        }else if(value==node.value){
            System.out.println(value+" found in BST");
            return node;
        }else if(value<node.value){
            return search(node.left,value);
        }else {
            return search(node.right,value);
        }
    }

    public BinaryNode deleteNode(BinaryNode rootNode, int value){
        if(rootNode==null){
            System.out.println("Value not found in BST !!!!");
            return null;
        }
        if(value<rootNode.value){
            rootNode.left=deleteNode(rootNode.left,value);
        }else if(value>rootNode.value){
            rootNode.right=deleteNode(rootNode.right,value);
        }else{
            if(rootNode.left!=null && rootNode.right!=null){
                BinaryNode tempNode=rootNode;
                BinaryNode minNodeForRight=minimumNode(tempNode.right);
                if(minNodeForRight!=null){
                    rootNode.value= minNodeForRight.value;
                }
                rootNode.right=deleteNode(rootNode.right, rootNode.value);
            }else if(rootNode.left!=null){
                rootNode=rootNode.left;
            }else if(rootNode.right!=null){
                rootNode=rootNode.right;
            }else{
                rootNode=null;
            }
        }
        return rootNode;
    }

    public BinaryNode minimumNode(BinaryNode node){
        if(node.left==null){
            return node;
        }else{
            return minimumNode(node.left);
        }
    }

    public void deleteBST(){
        root=null;
        System.out.println("BST deleted successfully !!!!!");
    }



}
