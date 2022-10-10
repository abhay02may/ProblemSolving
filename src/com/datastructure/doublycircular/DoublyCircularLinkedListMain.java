package com.datastructure.doublycircular;

public class DoublyCircularLinkedListMain {
    public static void main(String[] args) {
        DoublyCircularLinkedList doublyCircularLinkedList=new DoublyCircularLinkedList();
        doublyCircularLinkedList.createList(1);
        doublyCircularLinkedList.traverseList();
        doublyCircularLinkedList.insertNode(2,1);
        doublyCircularLinkedList.insertNode(3,5);
        doublyCircularLinkedList.insertNode(4,8);
        doublyCircularLinkedList.traverseList();
        doublyCircularLinkedList.reverseTraversal();
        doublyCircularLinkedList.searchItem(9);
        doublyCircularLinkedList.deleleteNode(2);
        doublyCircularLinkedList.traverseList();
        doublyCircularLinkedList.deleteEntireList();
        doublyCircularLinkedList.traverseList();
    }
}
