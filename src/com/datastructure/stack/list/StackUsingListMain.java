package com.datastructure.stack.list;

public class StackUsingListMain {
    public static void main(String[] args) {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.display();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Adding new elements\n");
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
       int topElement= stack.peek();
        System.out.println("topElement : "+topElement);
    }
}
