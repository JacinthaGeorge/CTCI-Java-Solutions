package Chapter03;

import java.util.Stack;

/**
 * Write a program to sort a stack in ascending order (with
 * biggest items on top). You may use at most one additional
 * stack to hold items, but you may not copy the elements into
 * any other data structure (such as an array). The stack supports
 * the following operations: push, pop, peek, and isEmpty.
 */

public class Q6 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(0);
        stack.push(3);
        stack.push(1);
        stack.push(-1);

        Stack<Integer> ans = sortStack(stack);

        while (!ans.isEmpty()) {
            System.out.println(ans.pop());
        }

    }

    public static Stack<Integer> sortStack(Stack<Integer> act) {
        int n = act.size();
        Stack<Integer> copy = new Stack<>();

        for (int i=0; i<n; i++) {
            int temp = act.size();
            int min = Integer.MAX_VALUE;

            while (!act.isEmpty()) {
                int num = act.pop();
                min = Math.min(min, num);

                copy.push(num);
            }

            int count = 0;
            while (count < temp) {
                int num = copy.pop();
                if (num != min) {
                    act.push(num);
                }
                count++;
            }

            copy.push(min);
        }

        return copy;
    }
}
