package Chapter02;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */

public class Q2 {

    public static int nthToLast(LinkedList linkedList, int n) {
        LinkNode h = linkedList.head;
        LinkNode r = linkedList.head;

        for (int i=0; i<n; i++) {
            r = r.next;
            if (r == null) return -1;
        }

        while (r.next != null) {
            r = r.next;
            h = h.next;
        }
        return h.data;
    }

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1,0};

        LinkedList linkedList = new LinkedList(arr[0]);

        for (int i=1; i<arr.length; i++) {
            linkedList.add(arr[i]);
        }

        // Initial List
        linkedList.printLinkedList();

        // Result from nthToLast function
        System.out.println(nthToLast(linkedList, 0));
        System.out.println(nthToLast(linkedList, 3));
        System.out.println(nthToLast(linkedList, 5));
        System.out.println(nthToLast(linkedList, 100));

    }
}
