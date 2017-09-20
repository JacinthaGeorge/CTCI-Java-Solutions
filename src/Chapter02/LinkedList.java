package Chapter02;

class LinkNode {

    int data;
    LinkNode next;

    public LinkNode(int item) {

        data = item;

    }

}
public class LinkedList {

    LinkNode head;

    public LinkedList(int item) {

        head = new LinkNode(item);

    }

    public void add(int item) {
        LinkNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new LinkNode(item);
    }

    public void printLinkedList() {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public LinkNode findTail () {
        LinkNode curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }
}