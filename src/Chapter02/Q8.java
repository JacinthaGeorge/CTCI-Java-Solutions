package Chapter02;

/**
 * Implement an algorithm to find a merge node amongst two Linked lists
 *
 */

class Q8 {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList(0);
        LinkedList l2 = new LinkedList(0);

        int[] arr1 = {1,2,3,5,6,7,8};
        int[] arr2 = {11,3,5,6,7,8};

        for (int i=0;i<arr1.length;i++) {
            l1.add(arr1[i]);
        }

        for (int i=0;i<arr2.length;i++) {
            l2.add(arr2[i]);
        }

        System.out.println(findMergeNode(l1.head.next, l2.head.next) == null ? -1 :
                            findMergeNode(l1.head.next, l2.head.next).data);
    }

    private static LinkNode findMergeNode(LinkNode l1, LinkNode l2) {

        int len1 = findLength(l1);
        int len2 = findLength(l2);

        if (len1 > len2) {
            int diff = len1 - len2;

            while (diff > 0) {
                l1 = l1.next;
                diff--;
            }
        }
        else {
            int diff = len2 - len1;
            while (diff > 0) {
                l2 = l2.next;
                diff--;
            }
        }

        while (l1 != null && l2 != null) {
            if (l1.data == l2.data) {
                return l1;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        return null;
    }

    private static int findLength(LinkNode l) {
        int c = 0;
        while (l != null) {

            c++;
            l = l.next;
        }

        return c;
    }
}
