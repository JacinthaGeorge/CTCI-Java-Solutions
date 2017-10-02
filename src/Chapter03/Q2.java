package Chapter03;

import java.util.ArrayList;
import java.util.Stack;

/**
 * How would you design a stack which, in addition to push
 * and pop, also has a function min which returns the minimum
 * element? Push, pop and min should all operate in O(1) time.
 */

public class Q2 {
    public static void main(String[] args) {

        StackImpl stack = new StackImpl();
        stack.push(6);
        stack.push(9);
        System.out.println(stack.getMinVal());
        stack.push(1);
        System.out.println(stack.getMinVal());
        stack.push(5);
        stack.pop();
        stack.pop();
        System.out.println(stack.getMinVal());
        stack.push(-1);
        System.out.println(stack.getMinVal());
    }
}

class StackImpl {

    Stack<ArrayList<Integer>> stack = new Stack<>();
    int minVal = Integer.MAX_VALUE;

    public void push(int n) {
        if (n < minVal) {
            minVal = n;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);
        arrayList.add(minVal);
        stack.push(arrayList);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int getMinVal() {
        return stack.peek().get(1);
    }
}
