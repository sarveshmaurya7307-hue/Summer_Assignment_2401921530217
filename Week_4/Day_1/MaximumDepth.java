class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class MaximumDepth {

    static int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(
                maxDepth(root.left),
                maxDepth(root.right)
        );
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(maxDepth(root));
    }
}
