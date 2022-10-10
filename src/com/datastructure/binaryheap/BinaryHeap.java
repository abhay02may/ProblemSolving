package com.datastructure.binaryheap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size){
        arr=new int[size+1];
        this.sizeOfTree=0;
        System.out.println("Binary Heap created successfully !!!!");
    }

    public boolean isEmpty(){
        if(sizeOfTree==0){
            return true;
        }else{
            return false;
        }
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Binary Heap is empty !!!!");
            return null;
        }else{
            return arr[1];
        }
    }

    public int sizeOfBinaryHeap(){
        return sizeOfTree;
    }

    public void levelOrderTraversal(){
        if(isEmpty()){
            System.out.println("Binary Heap is empty !!!");
            return;
        }
        for(int i=1;i<=sizeOfTree;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public void heapifyBottomToTop(int index,String heapType){
        if(index<=1){
            return;
        }
        int parent=index/2;
        if("Min".equals(heapType)){
            if(arr[index]<arr[parent]){
                swap(arr,index,parent);
            }
        }else if("Max".equals(heapType)){
            if(arr[index]>arr[parent]){
                swap(arr,index,parent);
            }
        }
        heapifyBottomToTop(parent,heapType);
    }

    public void swap(int arr[],int swapFrom,int swapTo){
        int temp=arr[swapFrom];
        arr[swapFrom]=arr[swapTo];
        arr[swapTo]=temp;
    }

    public void insert(int value,String heapType){
        arr[++sizeOfTree]=value;
        heapifyBottomToTop(sizeOfTree,heapType);
        System.out.println(value+" inserted successfully into binary heap !!!!!");
    }



}
