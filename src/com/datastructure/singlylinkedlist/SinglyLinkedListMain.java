package com.datastructure.singlylinkedlist;

import com.datastructure.singlylinkedlist.SinglyLinkedList;

public class SinglyLinkedListMain {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.insertIntoLinkedList(1,0);
        singlyLinkedList.insertIntoLinkedList(2,1);
        singlyLinkedList.insertIntoLinkedList(3,2);
        singlyLinkedList.insertIntoLinkedList(4,3);
        singlyLinkedList.insertIntoLinkedList(5,4);
        singlyLinkedList.insertIntoLinkedList(3,5);
        singlyLinkedList.display();
        singlyLinkedList.insertIntoLinkedList(4,3);
        System.out.println("\n ");
        singlyLinkedList.display();
        singlyLinkedList.search(3);
        singlyLinkedList.deleteNode(3);
        singlyLinkedList.display();
    }



}
