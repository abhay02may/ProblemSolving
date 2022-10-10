package com.datastructure.queue.list;

public class LinkedListForQueue {
    Node head;
    Node tail;
    int size;

    public Node createList(int nodeValue){
        head=new Node();
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        head.next=newNode;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    public void insertNodeAtLast(int nodeValue){
        if(head==null){
            createList(nodeValue);
            return;
        }
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public int deleteNodeFromFront(){
        if(head==null){
            System.out.println("\n List is empty!!!!");
            return -1;
        }
        int item= head.value;
        head=head.next;
        return item;
    }

    public int headNodeValue(){
        if(head==null){
            System.out.println("\n List is empty!!!!");
            return -1;
        }
        return head.value;
    }

    public void display(){
        if(head==null){
            System.out.println("\n List is empty!!!!");
            return ;
        }
        System.out.println();
        Node tempNode=head;
        while(tempNode!=null){
            System.out.print(tempNode.value+" ");
            tempNode=tempNode.next;
        }
    }



}
