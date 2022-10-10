package com.datastructure.tree.binary;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public BinaryNode root;

    public BinaryTree(){
        this.root=null;
    }

    void preOrderTraversal(BinaryNode node){
        if(node==null){
            return ;
        }
        System.out.print(node.value+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void inOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
    }

    void postOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value+" ");
    }

    void levelOrderTraversal(){
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

    public void searchNode(String value){
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.value.equals(value)){
                System.out.println("The value "+value+" found in the Binary Tree");
                return;
            }else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value "+value+" not found in the Binary Tree");
    }

    public void insertNode(String value){
        BinaryNode newNode=new BinaryNode();
        newNode.value=value;
        if(root==null){
            root=newNode;
            System.out.println("\n Inserted new node as root node");
            return;
        }
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.left==null){
                presentNode.left=newNode;
                System.out.println("Node inserted at left node");
                break;
            }
            else if(presentNode.right==null){
                presentNode.right=newNode;
                System.out.println("Node inserted at right node");
                break;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    public void deleteNode(String value){
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(value.equals(presentNode.value)){
                presentNode.value=getDeepestNode().value;
                deleteDeepesetNode();
                System.out.println("Node "+value+" deleted from the Binary Tree !!!!");
                return;
            }else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("Node "+value+" could not be deleted from the binary tree");
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode=null;
        while(!queue.isEmpty()){
            presentNode=queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepesetNode(){
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode=null;
        BinaryNode previousNode=null;
        while(!queue.isEmpty()){
            previousNode=presentNode;
            presentNode=queue.remove();
            if(presentNode.left==null){
                previousNode.right=null;
                return;
            }
            if(presentNode.right==null){
                presentNode.left=null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    public void deleteBinaryTree(){
        root=null;
        System.out.println("Binary Tree deleted !!!!");
    }

}
