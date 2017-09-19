package Chapter02;

/**
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 */

public class Q3 {

    public static boolean deleteNode(LinkNode n) {
        if (n == null || n.next == null) return false;
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {3,2,1,0};
        LinkedList linkedList = new LinkedList(arr[0]);

        for (int i=1; i<arr.length; i++) {
            linkedList.add(arr[i]);
        }

        // Initial List
        linkedList.printLinkedList();

        LinkNode head = linkedList.head;
        LinkNode n1 = head.next;
        LinkNode n2 = head.next.next;
        LinkNode n3 = null;

        System.out.println("Delete n3" + " : " + deleteNode(n3));
        linkedList.printLinkedList();

        System.out.println("Delete n2" + " : " + deleteNode(n2));
        linkedList.printLinkedList();

        System.out.println("Delete n1" + " : " + deleteNode(n1));
        linkedList.printLinkedList();

    }
}
