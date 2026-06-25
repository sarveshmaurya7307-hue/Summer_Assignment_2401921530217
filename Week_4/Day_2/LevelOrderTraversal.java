
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class LevelOrderTraversal {

    static void levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            Node curr = queue.poll();

            System.out.print(curr.data + " ");

            if (curr.left != null)
                queue.offer(curr.left);

            if (curr.right != null)
                queue.offer(curr.right);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        levelOrder(root);
    }
}