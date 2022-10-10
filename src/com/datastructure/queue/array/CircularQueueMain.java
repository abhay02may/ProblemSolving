package com.datastructure.queue.array;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue circularQueue=new CircularQueue(5);
        circularQueue.display();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.display();
        circularQueue.enqueue(5);
        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.display();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.display();


    }
}
