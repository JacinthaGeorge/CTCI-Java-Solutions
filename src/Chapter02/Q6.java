package Chapter02;

/**
 * Given a circular linked list, implement an algorithm which returns
 * the node at the beginning of the loop.
 */

public class Q6 {

    public static LinkNode findBeginningNode(LinkNode head) {
        LinkNode slow = head;
        LinkNode fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        LinkedList linkedList = new LinkedList(arr[0]);

        for (int i=1;i<arr.length;i++) {
            linkedList.add(arr[i]);
        }

        // print the normal linked list
        linkedList.printLinkedList();

        LinkNode head = linkedList.head;

        // Converting to a circular linked list
        linkedList.findTail().next = linkedList.head;

        // Finding the starting node
        System.out.println(findBeginningNode(head).data);
    }
}
