package com.datastructure.doublylinkedlist;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.traverseList();
        doublyLinkedList.createDoublyLinkedList(0);
        doublyLinkedList.insertElements(1,1);
        doublyLinkedList.insertElements(3,3);
        doublyLinkedList.insertElements(2,2);
        doublyLinkedList.insertElements(4,4);
        doublyLinkedList.insertElements(5,5);
        doublyLinkedList.traverseList();
        doublyLinkedList.reverseTraverseList();
        doublyLinkedList.search(4);
        doublyLinkedList.deleteNode(5);
        doublyLinkedList.traverseList();
        doublyLinkedList.reverseTraverseList();
        doublyLinkedList.deleteNode(4);
        doublyLinkedList.traverseList();
        doublyLinkedList.reverseTraverseList();

    }
}
