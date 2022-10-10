package com.datastructure.binaryheap;

public class BinaryHeapMain {
    public static void main(String[] args) {
        BinaryHeap binaryHeap=new BinaryHeap(10);
        binaryHeap.insert(10,"Min");
        binaryHeap.insert(5,"Min");
        binaryHeap.insert(20,"Min");
        binaryHeap.insert(30,"Min");
        binaryHeap.peek();
        binaryHeap.levelOrderTraversal();

    }
}
