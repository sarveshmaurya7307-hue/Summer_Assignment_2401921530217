class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class PalindromeLinkedList {
    static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        while (prev != null) {
            if (head.data != prev.data) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        System.out.println(isPalindrome(head));
    }
}
