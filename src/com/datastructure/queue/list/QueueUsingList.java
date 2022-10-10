package com.datastructure.queue.list;

public class QueueUsingList {
    LinkedListForQueue linkedListForQueue;

    public QueueUsingList(){
        linkedListForQueue=new LinkedListForQueue();
    }

    public void enqueue(int value){
        linkedListForQueue.insertNodeAtLast(value);
    }

    public void dequeue(){
        int item= linkedListForQueue.deleteNodeFromFront();
        System.out.println("\n"+item+" deleted from the queue !!!!");
    }

    public void peek(){
        int item=linkedListForQueue.headNodeValue();
        System.out.println("\n Peek element is : "+item);
    }

    public void display(){
        linkedListForQueue.display();
    }

}
