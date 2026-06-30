class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PathSum {

    static boolean hasPathSum(Node root, int sum) {

        if (root == null)
            return false;

        if (root.left == null && root.right == null)
            return sum == root.data;

        return hasPathSum(root.left, sum - root.data) ||
               hasPathSum(root.right, sum - root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        System.out.println(hasPathSum(root, 22));
    }
}
