package Chapter02;

/**
 * You have two numbers represented by a linked list, where each node contains a
 * single digit. The digits are stored in reverse order, such that the 1 's digit
 * is at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list.
 */

public class Q5 {

    public static void addTwoLinkedList (LinkedList num1, LinkedList num2) {

        LinkNode head1 = num1.head;
        LinkNode head2 = num2.head;


        int firstDigit = (head1.data + head2.data)%10;
        int carry = (head1.data + head2.data)/10;

        LinkedList ans = new LinkedList(firstDigit);
        head1 = head1.next;
        head2 = head2.next;

        while (head1 != null || head2 != null) {

            int num = 0;
            if (head1 != null) {
                num += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                num += head2.data;
                head2 = head2.next;
            }

            num += carry;
            carry = num/10;

            ans.add(num%10);
        }

        ans.printLinkedList();
    }

    public static void main(String[] args) {
        int[] num1 = {2,1,8,1,4};
        int[] num2 = {8,8,1};

        LinkedList num1List = new LinkedList(num1[0]);
        LinkedList num2List = new LinkedList(num2[0]);

        for (int i=1;i< num1.length;i++) {
            num1List.add(num1[i]);
        }

        for (int i=1;i< num2.length;i++) {
            num2List.add(num2[i]);
        }

        addTwoLinkedList(num1List, num2List);
    }
}
