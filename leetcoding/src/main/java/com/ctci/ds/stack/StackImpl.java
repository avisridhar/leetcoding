package com.ctci.ds.stack;

public class StackImpl {
    private final int stackCapacity;
    private int[] values;
    private int top;

    StackImpl(int capacity) {
        this.stackCapacity = capacity;
        this.values = new int[capacity];
        top = -1;
    }

    // push
    boolean push(int pushedElement) {
        if (!isFull()) {
            top++;
            values[top] = pushedElement;
            System.out.println(String.format("Pushed Element is %d", values[top]));
        } else {
            System.out.println("Stack is full");
            return false;
        }

        return true;
    }

    // pop
    int pop() {
        if (!isEmpty()) {
            int returnedElement = top;
            top--;
            System.out.println(String.format("Popped Element is %d", values[returnedElement]));
            return values[returnedElement];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // peek
    int peek() {
        if (!isEmpty()) {
            int idxOfTopStackElement = top;
            System.out.println(String.format("%d is stack top element", values[idxOfTopStackElement]));
            return values[idxOfTopStackElement];
        } else {
            return -1;
        }
    }

    // min ??

    boolean isFull () {
        return (stackCapacity - 1 == top);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    int indexOfTop() {
        return -1;
    }
}
