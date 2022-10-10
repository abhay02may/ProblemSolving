package com.datastructure.singlycircularlinkedlist;

public class CircularLinkedListMain {

    public static void main(String[] args) {
        SinglyCircularLinkedList circularLinkedList=new SinglyCircularLinkedList();
        circularLinkedList.insertNode(0,0);
        circularLinkedList.insertNode(1,1);
        circularLinkedList.insertNode(2,2);
        circularLinkedList.insertNode(3,3);
        circularLinkedList.insertNode(6,4);
        circularLinkedList.insertNode(8,5);
        circularLinkedList.insertNode(7,5);
        circularLinkedList.insertNode(5,4);
        //circularLinkedList.traverseList();
        circularLinkedList.insertNode(4,4);
        circularLinkedList.traverseList();
        circularLinkedList.search(3);
        circularLinkedList.deleteNode(0);
        circularLinkedList.deleteNode(7);
        circularLinkedList.deleteNode(2);
        circularLinkedList.traverseList();
    }
}
