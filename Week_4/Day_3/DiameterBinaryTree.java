class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class DiameterBinaryTree {

    static int diameter = 0;

    static int depth(Node root) {

        if (root == null)
            return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        depth(root);

        System.out.println(diameter);
    }
}
