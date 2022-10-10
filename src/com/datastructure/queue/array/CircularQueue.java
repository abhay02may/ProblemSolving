package com.datastructure.queue.array;

public class CircularQueue {
    int beginningOfQueue;
    int topOfQueue;
    int queue[];

    public CircularQueue(int size){
        queue=new int[size];
        beginningOfQueue=-1;
        topOfQueue=-1;
        System.out.println(" Circular Queue created successfully with size : "+size);
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("\n Circular Queue is Full ");
            return;
        }
        if(topOfQueue!=queue.length-1){
            topOfQueue++;
            if(topOfQueue==0 && beginningOfQueue==-1){
                beginningOfQueue=0;
            }
        }else{
            System.out.println("\n Queue full and going to start from 0");
            topOfQueue=0;
        }
        //System.out.println("topOfQueue : "+topOfQueue);
        queue[topOfQueue]=value;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("\n Queue is Empty !!!!");
            return -1;
        }
        System.out.println();
        int item=queue[beginningOfQueue];
        queue[beginningOfQueue]=0;
        if(beginningOfQueue+1==queue.length){
            beginningOfQueue=0;
        }else if (beginningOfQueue==topOfQueue){
            beginningOfQueue=topOfQueue=-1;
        } else{
            beginningOfQueue++;
        }
        System.out.println(item+" deleted from the queue!!!!");
        return item;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("\n Queue is Empty !!!!");
            return ;
        }
        System.out.println();
        if(topOfQueue>beginningOfQueue){
            for(int i=beginningOfQueue;i<=topOfQueue;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }else{
            for(int i=beginningOfQueue;i<queue.length;i++){
                System.out.print(queue[i]+" ");
            }
            for(int i=0;i<=topOfQueue;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }

    public boolean isFull(){
        if((beginningOfQueue==0 && topOfQueue==queue.length-1) || (beginningOfQueue==1 && topOfQueue==0)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(beginningOfQueue==-1 || (beginningOfQueue==topOfQueue)){
            return true;
        }else{
            return false;
        }
    }
}
