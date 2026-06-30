import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class SerializeTree {

    static String serialize(Node root) {

        if (root == null)
            return "null,";

        return root.data + "," +
                serialize(root.left) +
                serialize(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        System.out.println(serialize(root));
    }
}
