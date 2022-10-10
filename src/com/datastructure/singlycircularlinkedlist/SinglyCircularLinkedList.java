package com.datastructure.singlycircularlinkedlist;

public class SinglyCircularLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void insertNode(int nodeValue,int location){
        Node newNode=new Node();
        newNode.value=nodeValue;
        if(head==null){
            head=new Node();
            newNode.next=newNode;
            head=newNode;
            tail=newNode;
            size=1;
        }else if(location==0){
            newNode.next=head;
            head=newNode;
            tail.next=newNode;
            size++;
        }else if(location>=size){
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
            size++;
        }else {
            Node tempNode=head;
            for (int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            size++;
        }
    }

    public void traverseList(){
        if(head==null){
            System.out.println("\n List is empty!!!!");
            return;
        }
        System.out.println("\n");
        Node tempNode=head;
        for (int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print(" -> ");
            }
            tempNode=tempNode.next;
        }
    }

    public void search(int nodeValue){
        if(head==null){
            System.out.println("\n List is empty!!!");
            return;
        }
        System.out.println("\n");
        Node tempNode=head;
        for(int i=0;i<size;i++){
            if(tempNode.value==nodeValue){
                System.out.println(+nodeValue+" found at location : "+i);
                return;
            }
            tempNode=tempNode.next;
        }
        System.out.println(nodeValue +" Not Found in the list ");
    }

    public void deleteNode(int location){
        if(head==null){
            System.out.println("\n List is empty!!!");
            return;
        }
        // 1 2 3 4 5
        if(location==0){
            head=head.next;
            tail.next=head;
            size--;
            if(size==0){
                head=tail=null;
                head.next=null;
                return;
            }
        }else if(location>=size){
            Node tempNode=head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
            }
            if(tempNode==head){
                head=tail=null;
                head.next=null;
                size=0;
                return;
            }
            tempNode.next=head;
            tail=tempNode;
            size--;
        }else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }

    public void deleteList(){
        if(head==null){
            System.out.println("\n List is already empty ");
            tail.next=null;
            tail=null;
            return;
        }else{
            head=null;
            head.next=null;
            tail.next=null;
            tail=null;
            System.out.println("\n List deleted !!!!");
        }
    }


}
