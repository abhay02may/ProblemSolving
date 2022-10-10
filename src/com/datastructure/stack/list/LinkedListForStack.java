package com.datastructure.stack.list;

public class LinkedListForStack {
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

    public void insertNodeAtFront(int nodeValue){
        if(head==null){
            createList(nodeValue);
            return;
        }else{
            Node newNode=new Node();
            newNode.value=nodeValue;
            newNode.next=head;
            head=newNode;
            size++;
        }
    }

    public int deleteNode(){
        if(head==null){
            System.out.println("Stack Empty !!!!");
            return -1;
        }
        int value=head.value;
        head=head.next;
        return value;
    }

    public int firstElement(){
        if(head==null){
            System.out.println("Stack Empty !!!!");
            return -1;
        }
        return head.value;
    }

    public void display(){
        if(head==null){
            System.out.println("Stack Empty !!!!");
            return ;
        }
        Node tempNode=head;
        while(tempNode!=null){
            System.out.println(tempNode.value);
            tempNode=tempNode.next;
        }
    }

}
