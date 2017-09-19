package Chapter02;

import java.util.Stack;

/**
 * Write code to partition a linked list around a value x, such that all
 * nodes less than x come before all nodes greater than or equal to x.
 */

public class Q4 {

    public static void partition(LinkedList linkedList, int partitionPoint) {
        Stack<Integer> lower = new Stack<>();
        Stack<Integer> higher = new Stack<>();

        // For the case if partition point is repeated in the actual list
        Stack<Integer> equal = new Stack<>();

        LinkNode curr = linkedList.head;

        while (curr != null) {
            if (curr.data > partitionPoint) {
                higher.push(curr.data);
            }
            else if (curr.data < partitionPoint) {
                lower.push(curr.data);
            }
            else {
                equal.push(curr.data);
            }

            curr = curr.next;
        }

        createPartitionedLinkedList(lower, equal, higher);
    }

    public static void createPartitionedLinkedList(Stack<Integer> lower, Stack<Integer> equal,
                                                  Stack<Integer> higher) {

        int startVal = lower.empty() ? equal.pop() : lower.pop();

        LinkedList ans = new LinkedList(startVal);

        while (!lower.empty()) {
            ans.add(lower.pop());
        }

        while (!equal.empty()) {
            ans.add(equal.pop());
        }

        while (!higher.empty()) {
            ans.add(higher.pop());
        }

        // Printing the final list
        ans.printLinkedList();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 5, 2, 9, 4};
        LinkedList linkedList = new LinkedList(arr[0]);

        for (int i=1; i<arr.length; i++) {
            linkedList.add(arr[i]);
        }

        // Initial List
        linkedList.printLinkedList();

        int partitionPoint = 5;

        partition(linkedList, partitionPoint);
    }
}
