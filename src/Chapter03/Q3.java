package Chapter03;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Imagine a (literal) stack of plates. If the stack gets too high, it
 * might topple. Therefore, in real life, we would likely start a new
 * stack when the previous stack exceeds some threshold. Implement a
 * data structure SetOfStacks that mimics this. SetOfStacks should be
 * composed of several stacks and should create a new stack once the
 * previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop()
 * should behave identically to a single stack (that is, pop() should
 * return the same values as it would if there were just a single stack).
 *
 * FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation
 * on a specific sub-stack.
 */

public class Q3 {

    public static void main(String[] args) {
        stackOfStacks stackOfStacks = new stackOfStacks();

        // Basic pop and push for stacks of stacks
        stackOfStacks.push(1);
        stackOfStacks.push(2);
        stackOfStacks.push(3);
        stackOfStacks.push(4);
        stackOfStacks.push(9);
        System.out.println(stackOfStacks.pop());
        System.out.println(stackOfStacks.pop());
        System.out.println(stackOfStacks.pop());
        System.out.println(stackOfStacks.pop());
        System.out.println(stackOfStacks.pop());

        // popAt for stack of stacks
        stackOfStacks.push(1);
        stackOfStacks.push(2);
        stackOfStacks.push(3);
        stackOfStacks.push(4);
        stackOfStacks.push(9);
        System.out.println(stackOfStacks.popAt(1));
        System.out.println(stackOfStacks.popAt(0));
        System.out.println(stackOfStacks.popAt(1));
    }
}

class stackOfStacks {

    private ArrayList<Stack<Integer>> arrayList = new ArrayList<>();
    private int stackLimit = 3;
    private int stackCount = 0;

    public stackOfStacks() {
        Stack<Integer> stack = new Stack<>();
        arrayList.add(stack);
    }

    public void push(int n) {
        arrayList.get(arrayList.size()-1).push(n);
        stackCount++;
        if (stackCount == stackLimit) {
            stackCount = 0;
            arrayList.add(new Stack<Integer>());
        }
    }

    public int pop() {
        int temp = arrayList.get(arrayList.size()-1).pop();

        if (arrayList.get(arrayList.size()-1).isEmpty()) {
            arrayList.remove(arrayList.size()-1);
        }

        return temp;
    }

    public int popAt(int i) {
        int temp = arrayList.get(i).pop();
        if (arrayList.get(i).isEmpty()) {
            arrayList.remove(i);
        }

        return temp;
    }
}