package com.datastructure.stack.array;

public class Stack {

    int stack[];
    int top;
    int capacity;

    public Stack(int capacity){
        this.capacity=capacity;
        stack=new int[capacity];
        top=-1;
    }

    public void push(int item){
        if(top==stack.length-1){
            System.out.println("\n Stack over flow \n");
            return;
        }
        top++;
        stack[top]=item;
    }

    public int pop(){
        if(top==-1){
            System.out.println("\n Stack is Empty \n");
            return -1;
        }
        int item=stack[top--];
        return item;
    }

    public int peek(){
        if(top==-1){
            System.out.println("\n Stack is Empty \n");
            return -1;
        }
        return stack[top];
    }

    public void display(){
        if(top==-1){
            System.out.println("\n Stack is Empty \n");
            return ;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }



}
