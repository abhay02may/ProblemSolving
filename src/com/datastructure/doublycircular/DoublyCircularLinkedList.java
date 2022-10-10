package com.datastructure.doublycircular;

public class DoublyCircularLinkedList {
    Node head;
    Node tail;
    int size;

    public Node createList(int nodeValue){
        head=new Node();
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=newNode;
        newNode.prev=newNode;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    public void insertNode(int nodeValue,int location){
        Node newNode=new Node();
        newNode.value=nodeValue;
        if(head==null){
            createList(nodeValue);
            return;
        }else if(location==0){
                newNode.next=head;
                newNode.prev=tail;
                head.prev=newNode;
                head.next=newNode;
                head=newNode;
                tail.next=newNode;
                size++;
        }else if(location>=size){
                newNode.next=head;
                newNode.prev=tail;
                head.prev=newNode;
                tail.next=newNode;
                tail=newNode;
                size++;
        }else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            newNode.prev=tempNode;
            newNode.next= tempNode.next;
            tempNode.next.prev=newNode;
            tempNode.next=newNode;
            size++;
        }
    }

    public boolean searchItem(int nodeValue){
        if(head==null){
            System.out.println("\n List is Empty !!");
            return false;
        }
        System.out.println();
        Node tempNode=head;
        for(int i=0;i<size;i++){
            if(tempNode.value==nodeValue){
                System.out.println(nodeValue+" found at location : "+i);
                return true;
            }
            tempNode=tempNode.next;
        }
        System.out.println(nodeValue+" Not found in the list");
        return false;
    }

    public void traverseList(){
        if(head==null){
            System.out.println("\n List is empty!!!");
            return;
        }
        System.out.println();
        Node tempNode=head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print(" -> ");
            }
            tempNode=tempNode.next;
        }
    }

    public void reverseTraversal(){
        if(head==null){
            System.out.println("\n List is empty!!!");
            return;
        }
        System.out.println();
        Node tempNode=tail;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print(" <- ");
            }
            tempNode=tempNode.prev;
        }
    }

    public void deleleteNode(int location){
        if(head==null){
            System.out.println("\n List is already empty");
            return;
        } else if(location==0){
            if(size==1){
                head.next=null;
                head.prev=null;
                head=null;
                tail=null;
                size--;
            }else{
                head=head.next;
                head.prev=tail;
                tail.next=head;
                size--;
            }
        }else if(location>=size){
            if(size==1){
                head.next=null;
                head.prev=null;
                head=null;
                tail=null;
                size--;
            }
            else{
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }
    }

    public void deleteEntireList(){
        if(head==null){
            System.out.println("\n List is already empty\n");
            return;
        }
        System.out.println();
        Node tempNode=head;
        for(int i=0;i<size;i++){
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        tail=null;
        head=null;
        System.out.println("Entire List deleted !!!!");
        return;

    }

}
