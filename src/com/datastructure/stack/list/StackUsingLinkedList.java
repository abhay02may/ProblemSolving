package com.datastructure.stack.list;

public class StackUsingLinkedList {
    LinkedListForStack list;

    public StackUsingLinkedList(){
        list=new LinkedListForStack();
    }

    public void push(int item){
        list.insertNodeAtFront(item);
    }

    public int pop(){
        int item=list.deleteNode();
        if(item==-1){
            System.out.println(" Stack is EMPTY !!!!");
            return -1;
        }
        else{
            System.out.println(item+" deleted from Stack ");
            return item;
        }
    }

    public int peek(){
        return list.firstElement();
    }

    public void display(){
        list.display();
    }

}
