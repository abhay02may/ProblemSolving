package com.datastructure.stack;

public class ThreeInOne {
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  public ThreeInOne(int stackSize) {
    this.stackCapacity=stackSize;
    this.values=new int[stackSize];
    this.sizes=new int[stackSize];
  }

  // isFull
  public boolean isFull(int stackNum) {
    // TODO

    return false;
  }

  // isEmpty
  public boolean isEmpty(int stackNum) {
      // TODO

    return false;
  }

  // indexOfTop - this is helper method for push, pop and peek methods

  private int indexOfTop(int stackNum) {
    // TODO


    return -1;
  }

  // push
  public void push(int stackNum, int value) {
    // TODO
  }

  // pop
  public int pop(int stackNum) {
    // TODO

    return -1;
  }

  // peek

  public int peek(int stackNum) {
    // TODO

    return -1;
  }

}
