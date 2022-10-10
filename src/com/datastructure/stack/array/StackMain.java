package com.datastructure.stack.array;

import com.datastructure.stack.array.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack=new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println(" Top Element of Stack: ");
        System.out.println(stack.peek());
        System.out.println("Calling pop twice");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("calling display\n");
        stack.display();

    }
}
