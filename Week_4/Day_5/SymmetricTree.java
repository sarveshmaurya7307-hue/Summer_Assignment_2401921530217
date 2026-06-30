class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class SymmetricTree {

    static boolean isMirror(Node left, Node right) {

        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        return left.data == right.data &&
               isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println(isMirror(root.left, root.right));
    }
}
