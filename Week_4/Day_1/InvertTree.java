class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class InvertTree {

    static Node invert(Node root) {

        if (root == null) {
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }

    static void inorder(Node root) {

        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        invert(root);
        inorder(root);
    }
}
