class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class MaximumPathSum {
    static int maxSum = Integer.MIN_VALUE;

    static int gain(Node root) {

        if (root == null)
            return 0;
        int left = Math.max(gain(root.left), 0);
        int right = Math.max(gain(root.right), 0);

        maxSum = Math.max(maxSum,
                          root.data + left + right);

        return root.data + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        gain(root);
        System.out.println(maxSum);
    }
}
