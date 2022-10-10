package com.datastructure.queue.array;

public class QueueUsingArray {
    int queue[];
    int beginingOfQueue;
    int topOfQueue;

    public QueueUsingArray(int size){
        queue=new int[size];
        beginingOfQueue=-1;
        topOfQueue=-1;
        System.out.println("Queue create with size : "+size);
    }

    public void enqueue(int item){
        if(topOfQueue==queue.length-1){
            System.out.println("Queue Full !!!!!");
            return;
        }
        queue[++topOfQueue]=item;
        if(topOfQueue==0){
            beginingOfQueue=0;
        }
    }

    public int dequeue(){
        if(beginingOfQueue==-1){
            System.out.println("\nQueue is empty");
            return -1;
        }
        int item=queue[beginingOfQueue++];
        System.out.println("\n"+item+" deleted from the beginning of the queue");
        if(beginingOfQueue>topOfQueue){
            beginingOfQueue=topOfQueue=-1;
        }
        return item;
    }

    public int peek(){
        if(beginingOfQueue==-1){
            System.out.println("\nQueue is empty");
            return -1;
        }
        int item=queue[beginingOfQueue];
        System.out.println(" \n Top Element of the Queue is : "+item);
        return item;
    }

    public void display(){
        if(beginingOfQueue==-1){
            System.out.println("\nQueue is empty");
            return ;
        }
        for(int i=beginingOfQueue;i<=topOfQueue;i++){
            System.out.print(queue[i]+" ");
        }
    }
}
