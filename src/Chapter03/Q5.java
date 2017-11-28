package Chapter03;

import java.util.Stack;

/**
 * Implement a MyQueue class which implements a queue using two stacks.
 */

public class Q5 {

    public static void main(String[] args) {

        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        // Should return 1
        System.out.println(queue.peek());

        // Should return 1
        System.out.println(queue.pop());

        queue.push(4);

        // Should return 2
        System.out.println(queue.pop());

    }
}

class QueueUsingTwoStacks {
    Stack<Integer> oldStack = new Stack<>();
    Stack<Integer> newStack = new Stack<>();

    public void push(int n) {
        while (!newStack.isEmpty()) {
            oldStack.push(newStack.pop());
        }
        oldStack.push(n);
    }

    public int pop() {
        while (!oldStack.isEmpty()) {
            newStack.push(oldStack.pop());
        }

        return newStack.pop();
    }

    public int peek() {
        while (!oldStack.isEmpty()) {
            newStack.push(oldStack.pop());
        }

        return newStack.peek();
    }
}