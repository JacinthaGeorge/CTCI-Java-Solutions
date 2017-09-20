package Chapter02;

import java.util.Stack;

/**
 * Implement a function to check if a linked list is
 * a palindrome (like 0->1->2->1->0).
 */

public class Q7 {

    public  static boolean isPalindrome (LinkedList linkedList) {

        if (linkedList.head == null || linkedList.head.next == null) return true;

        boolean ans = true;

        Stack<Integer> stack = new Stack<>();
        LinkNode head = linkedList.head;
        LinkNode curr = head;
        int count = 0;

        while (head != null) {
            stack.push(head.data);
            head = head.next;
            count++;
        }

        int half = count/2;

        while (half != 0) {
            if (stack.pop() != curr.data) {
                ans = false;
                break;
            }
            curr = curr.next;
            half--;
        }

        return ans;
    }

    public static void main(String[] args) {

        // Test Case 1: Gives True
        int[] arr = {1,2,3,4,4,3,2,1};
        LinkedList linkedList = new LinkedList(arr[0]);

        for (int i=1;i<arr.length;i++) {
            linkedList.add(arr[i]);
        }

        linkedList.printLinkedList();
        System.out.println(isPalindrome(linkedList));

        // Test Case 1: Gives False
        int[] arr2 = {1,2,3,4,4,3,2};
        LinkedList linkedList2 = new LinkedList(arr2[0]);

        for (int i=1;i<arr2.length;i++) {
            linkedList2.add(arr2[i]);
        }

        linkedList2.printLinkedList();
        System.out.println(isPalindrome(linkedList2));
    }

}
