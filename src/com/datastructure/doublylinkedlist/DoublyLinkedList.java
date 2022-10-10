package com.datastructure.doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public Node createDoublyLinkedList(int nodeValue){
        head=new Node();
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        newNode.prev=null;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    public void insertElements(int nodeValue,int location){
        Node newNode=new Node();
        newNode.value=nodeValue;
        if(head==null){
            createDoublyLinkedList(nodeValue);
        }else if(location==0){
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;
            size++;
        }else if(location>=size){
            newNode.next=null;
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
            size++;
        }else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            newNode.next=tempNode.next;
            newNode.prev=tempNode;
            newNode.next.prev=newNode;
            tempNode.next=newNode;
            size++;
        }
    }

    public void traverseList(){
        if(head==null){
            System.out.println("\n List is Empty !!!!");
            return;
        }
        System.out.println();
        Node tempNode=head;
        int i=0;
        while(tempNode!=null){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print(" -> ");
            }
            i++;
            tempNode=tempNode.next;
        }
    }
    public void reverseTraverseList(){
        if(head==null){
            System.out.println("\n List is Empty !!!!");
            return;
        }
        System.out.println();
        Node tempNode=tail;
        int i=size-1;
        while(i>=0){
            System.out.print(tempNode.value);
            if(i!=0){
                System.out.print(" <- ");
            }
            i--;
            tempNode=tempNode.prev;
        }
    }

    public void search(int nodeValue){
        if(head==null){
            System.out.println("\n List is Empty !!!!!");
            return;
        }
        System.out.println();
        Node tempNode=head;
        int loc=0;
        while(tempNode!=null){
            if(tempNode.value==nodeValue){
                System.out.println(+nodeValue+" found at location "+loc);
                return;
            }
            loc++;
            tempNode=tempNode.next;
        }
        System.out.println(+nodeValue+" not found in the list ");
    }

    public void deleteNode(int location){
        if(head==null){
            System.out.println("\n List is Empty !!!!!");
            return;
        } else if(location==0){
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }else {
                head=head.next;
                head.prev=null;
                size--;
            }
        } else if(location>=size-1){
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }else{
                Node tempNode=tail.prev;
                tempNode.next=null;
                tail=tempNode;
                size--;
            }
        }else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            System.out.println("Before : "+tempNode.value);
            tempNode.next=tempNode.next.next;
            System.out.println("After : "+tempNode.value);
            tempNode.next.prev=tempNode;
            size--;
        }
    }

    public void deleteEntireList(){
        if(head!=null){
            Node tempNode=head;
            for (int i=0;i<size;i++){
                tempNode.prev=null;
                tempNode=tempNode.next;
            }
            head=null;
            tail=null;
            System.out.println("Entire List deleted !!!!!");
        }
    }


}
