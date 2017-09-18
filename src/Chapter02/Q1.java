package Chapter02;

import java.util.HashMap;

/**
 * Write code to remove duplicates from an unsorted linked list.
 *
 */

public class Q1 {

    public static void removeDuplicates (LinkedList linkedList) {

        HashMap<Integer, Integer> ht = new HashMap<>();
        if (linkedList.head == null) return;
        LinkNode h = linkedList.head;
        LinkNode curr = h.next;
        LinkNode prev = h;
        LinkNode temp;

        ht.put(h.data, 1);

        while (curr != null) {
            if (ht.containsKey(curr.data)) {
                prev.next = curr.next;
                temp = curr;
                curr = curr.next;
                temp.next = null;
            }
            else {
                ht.put(curr.data, 1);
                prev = curr;
                curr = curr.next;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,2,5,5};
        LinkedList linkedList = new LinkedList(arr[0]);

        for (int i=1; i<arr.length; i++) {
            linkedList.add(arr[i]);
        }

        // Initial Linked List
        linkedList.printLinkedList();

        removeDuplicates(linkedList);

        // After removal of duplicates
        linkedList.printLinkedList();
    }
}
