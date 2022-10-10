package com.datastructure.tree.avl;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;

    public AVLTree(){
        root=null;
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return ;
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

    public BinaryNode search(BinaryNode node,int value){
        if(node==null){
            System.out.println(value+" not found in AVL Tree !!!!!");
            return null;
        }else if(value==node.value){
            System.out.println(value+" found in AVL Tree !!!!!");
            return node;
        }else if(value<node.value){
            return search(node.left,value);
        }else{
            return search(node.right,value);
        }
    }

    public int getHeight(BinaryNode node){
        if(node==null){
            return 0;
        }
        return node.height;
    }

    public int getBalanceFactor(BinaryNode rootNode){
        if(rootNode==null){
            return 0;
        }
        return getHeight(rootNode.left)-getHeight(rootNode.right);
    }

    private BinaryNode rotateRight(BinaryNode disbalancedNode){
        BinaryNode newRootNode=disbalancedNode.left;
        disbalancedNode.left=disbalancedNode.left.right;
        newRootNode.right=disbalancedNode;
        disbalancedNode.height=1+Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        newRootNode.height=1+Math.max(getHeight(newRootNode.left),getHeight(newRootNode.right));
        return newRootNode;
    }

    private BinaryNode rotateLeft(BinaryNode disbalancedNode){
        BinaryNode newRootNode=disbalancedNode.right;
        disbalancedNode.right=disbalancedNode.right.left;
        newRootNode.left=disbalancedNode;
        disbalancedNode.height=1+Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        newRootNode.height=1+Math.max(getHeight(newRootNode.left),getHeight(newRootNode.right));
        return newRootNode;
    }

    private BinaryNode insertNode(BinaryNode node,int nodeValue){
        if(node==null){
            BinaryNode newNode=new BinaryNode();
            newNode.value=nodeValue;
            newNode.height=1;
            return newNode;
        } else if(nodeValue<node.value){
            node.left=insertNode(node.left,nodeValue);
        }else {
            node.right=insertNode(node.right,nodeValue);
        }
        node.height=1+Math.max(getHeight(node.left),getHeight(node.right));
        int balanceFactor=getBalanceFactor(node);

        if(balanceFactor>1 && nodeValue<node.left.value){
            return rotateRight(node);
        }
        if(balanceFactor>1 && nodeValue>node.left.value){
            node.left=rotateLeft(node.left);
            return rotateRight(node);
        }

        if(balanceFactor<-1 && nodeValue>node.right.value){
            return rotateLeft(node);
        }
        if(balanceFactor<-1 && nodeValue<node.right.value){
            node.right=rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void insertNode(int value){
        root=insertNode(root,value);
    }

    public BinaryNode minimumNode(BinaryNode node){
        if(node.left==null){
            return node;
        }
        return minimumNode(node.left);
    }

    public void deleteNode(int value){
        root=deleteNode(root,value);
    }

    private BinaryNode deleteNode(BinaryNode node,int value){
        if(node==null){
            System.out.println(value+" not found in AVL Tree !!!");
            return node;
        }else if(value<node.value){
            node.left=deleteNode(node.left,value);
        } else if(value>node.value){
            node.right=deleteNode(node.right,value);
        }else{
            if(node.left!=null && node.right!=null){
                BinaryNode tempNode=node;
                BinaryNode minNodeForRight=minimumNode(tempNode.right);
                node.value=minNodeForRight.value;
                node.right=deleteNode(node.right,minNodeForRight.value);
            }else if(node.left!=null){
                node=node.left;
            } else if(node.right!=null){
                node=node.right;
            }else{
                node=null;
            }
        }
        int balanceFactor=getBalanceFactor(node);
        if(balanceFactor>1 && getBalanceFactor(node.left)>=0){
            return rotateRight(node);
        }
        if(balanceFactor>1 && getBalanceFactor(node.left)<0){
            node.left=rotateLeft(node.left);
            return rotateRight(node);
        }

        if(balanceFactor<-1 && getBalanceFactor(node.right)<=0){
            return rotateLeft(node);
        }
        if(balanceFactor<-1 && getBalanceFactor(node.right)>0){
            node.right=rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    public void deleteAVLTree(){
        root=null;
        System.out.println("AVL Tree deleted successfully !!!!!");
        return;
    }


}
