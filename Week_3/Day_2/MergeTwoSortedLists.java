class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeTwoSortedLists {
    static Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);
        Node result = merge(l1, l2);
        print(result);
    }
}
