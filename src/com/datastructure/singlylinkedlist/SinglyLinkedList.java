package com.datastructure.singlylinkedlist;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createList(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        head=new Node();
        head=newNode;
        tail=newNode;
        size=1;
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

    public void insertIntoLinkedList(int nodeValue,int position){
        Node newNode=new Node();
        newNode.value=nodeValue;
        if(head==null){
            createList(nodeValue);
        }else if(position==0){
            newNode.next=head;
            head=newNode;
            size++;
        }else if(position>=size){
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
            size++;
        }else{
            Node tempNode=head;
            int index=0;
            while(index<position-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=newNode;
            newNode.next=nextNode;
            size++;
        }
    }

    public void deleteNode(int location){
        if(head==null){
            System.out.println("\n List is already Empty, you can not delete \n");
            return;
        }else if(location==0){
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
        }else if(location>=size){
            Node tempNode=head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
            }
            if(tempNode==head){
                head=tail=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }else {
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }

    public void deleteLinkList(){
        head=null;
        tail=null;
        System.out.println("\n LinkedList deleted !!!");
    }

    public boolean search(int value){
        if(head==null){
            System.out.println("\n List is empty ");
            return false;
        }
        Node tempNode=head;
        int pos=0;
        while(tempNode!=null){
            if(tempNode.value==value){
                System.out.println("\n");
                System.out.println(value+" found in the list at "+pos+" location");
                return true;
            }
            tempNode=tempNode.next;
            pos++;
        }
        System.out.println("\n"+value+" Not Found in the list !!!!");
        return false;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty !!!");
            return;
        }
        System.out.println();
        Node tempNode=head;
        int n=0;
        while(tempNode!=null){
            System.out.print(tempNode.value);
            if(n!=size-1){
                n++;
                System.out.print(" -> ");
            }
            tempNode=tempNode.next;
        }
    }


}
