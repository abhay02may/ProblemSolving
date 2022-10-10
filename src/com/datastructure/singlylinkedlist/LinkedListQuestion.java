package com.datastructure.singlylinkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListQuestion {

    public static void main(String[] args) {
        LinkedListQuestion question=new LinkedListQuestion();
        /*SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.insertIntoLinkedList(1,0);
        singlyLinkedList.insertIntoLinkedList(9,1);
        singlyLinkedList.insertIntoLinkedList(5,2);
        singlyLinkedList.insertIntoLinkedList(10,3);
        singlyLinkedList.insertIntoLinkedList(2,4);
        singlyLinkedList.display();
        question.removeDuplicates(singlyLinkedList);
        singlyLinkedList.display();
        Node nthToLastNode=question.nThToLast(singlyLinkedList,2);
        System.out.println("nthToLastNode :"+nthToLastNode.value);
        question.partitionList(singlyLinkedList,10);
        singlyLinkedList.display();*/

        /*SinglyLinkedList listA=new SinglyLinkedList();
        listA.insertNodeAtLast(7);
        listA.insertNodeAtLast(1);
        listA.insertNodeAtLast(6);
        SinglyLinkedList listB=new SinglyLinkedList();
        listB.insertNodeAtLast(5);
        listB.insertNodeAtLast(9);
        listB.insertNodeAtLast(2);
        SinglyLinkedList resultList=question.sumOfLists(listA,listB);
        resultList.display();*/

        /*Input List 1: 3->1->5->9->7->2->1
        Input List 2:    2->4->6->7->2->1*/
        SinglyLinkedList listA=new SinglyLinkedList();
        listA.insertNodeAtLast(3);
        listA.insertNodeAtLast(1);
        listA.insertNodeAtLast(5);
        listA.insertNodeAtLast(9);

        SinglyLinkedList listB=new SinglyLinkedList();
        listB.insertNodeAtLast(2);
        listB.insertNodeAtLast(4);
        listB.insertNodeAtLast(6);

        question.addSameNode(listA,listB,7);
        question.addSameNode(listA,listB,2);
        question.addSameNode(listA,listB,1);

        System.out.println("List A ");
        listA.display();
        System.out.println("\n List B ");
        listB.display();

        Node res=question.intersectionNode(listA,listB);
        System.out.println("\n Intersection Node : "+res.value);

    }
    /*
      Input List : 1->2->1->2->3->2->3
      Output List: 1->2->3
     */
    public void removeDuplicates(SinglyLinkedList linkedList){
        if(linkedList.head==null){
            System.out.println("\n List is empty ");
            return;
        }
        Node currentNode=linkedList.head;
        Node prevNode=null;
        Set<Integer> set=new HashSet<>();
        while(currentNode!=null){
            int currentValue=currentNode.value;
            if(set.contains(currentValue)){
                prevNode.next=currentNode.next;
                linkedList.size--;
            }else{
                set.add(currentValue);
                prevNode=currentNode;
            }
            currentNode=currentNode.next;
        }
    }
    /*
        Input : linkedList-> 1->2->3->4->5, n=2
        Output: Node having value 4
     */
    public Node nThToLast(SinglyLinkedList linkedList,int n){
        if(linkedList.head==null){
            System.out.println("\n List is empty !!!!");
            return null;
        }
        Node tempNode=linkedList.head;
        System.out.println("\nList Size: "+linkedList.size);
        for(int i=0;i<linkedList.size-n;i++){
            tempNode=tempNode.next;
        }
        //System.out.println("\n nThToLast : "+tempNode.value);

        return tempNode;
    }

    /*
        Input List: 1->9->5->10->2, x=10
        Output list: 2->1->9->5->10
     */
    public SinglyLinkedList partitionList(SinglyLinkedList linkedList,int x){
        Node currentNode=linkedList.head;
        linkedList.tail=linkedList.head;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            if(currentNode.value<x){
                currentNode.next=linkedList.head;
                linkedList.head=currentNode;
            }else{
                linkedList.tail.next=currentNode;
                linkedList.tail=currentNode;
            }
            currentNode=nextNode;
        }
        linkedList.tail.next=null;
        return linkedList;
    }
    /*
      List A : 7->1->6 (It is the reverse of 617 which is stored in the rev order, ie actual value number is 617)
      List B : 5->9->2  (It is the reverse of 295 which is stored in the rev order, ie actual value number is 295)
      Sum=617+295=912 and this sum to be stored in the list in rev order ie 2->1->9
      Output List: 2->1->9
     */

    public SinglyLinkedList sumOfLists(SinglyLinkedList listA,SinglyLinkedList listB){
        SinglyLinkedList resultList=new SinglyLinkedList();
        Node n1=listA.head;
        Node n2=listB.head;
        int carry=0;
        while(n1!=null || n2!=null){
            int result=carry;
            if(n1!=null){
                result+=n1.value;
                n1=n1.next;
            }
            if(n2!=null){
                result+=n2.value;
                n2=n2.next;
            }
            System.out.println("result : "+result);
            resultList.insertNodeAtLast(result%10);
            resultList.display();
            carry=result/10;
        }
        return resultList;
    }

    /*
            Intersection of 2 list
            Input List 1: 3->1->5->9->7->2->1
            Input List 2:    2->4->6->7->2->1
            Output : 7
     */
    public Node intersectionNode(SinglyLinkedList list1,SinglyLinkedList list2){
        if(list1.head==null || list2.head==null){
            return null;
        }
        if(list1.tail!=list2.tail){
            return null;
        }
        Node longer=new Node();
        Node shorter=new Node();
        if(list1.size>list2.size){
            longer=list1.head;
            shorter=list2.head;
        }else{
            longer=list2.head;
            shorter=list1.head;
        }
        longer=kthNodeInList(longer,Math.abs(list1.size- list2.size));
        while(shorter!=longer){
            shorter=shorter.next;
            longer=longer.next;
        }
        return shorter;
    }
    public Node kthNodeInList(Node head,int k){
        Node currentNode=head;
        while(k>0 && currentNode!=null){
            currentNode=currentNode.next;
            k--;
        }
        return currentNode;
    }

    public void addSameNode(SinglyLinkedList list1,SinglyLinkedList list2,int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        //newNode.next=null;
        list1.tail.next=newNode;
        list1.tail=newNode;
        list2.tail.next=newNode;
        list2.tail=newNode;
    }



}
