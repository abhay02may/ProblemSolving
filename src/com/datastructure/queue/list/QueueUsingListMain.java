package com.datastructure.queue.list;

public class QueueUsingListMain {
    public static void main(String[] args) {
        QueueUsingList queue=new QueueUsingList();
        queue.display();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.peek();
    }
}
