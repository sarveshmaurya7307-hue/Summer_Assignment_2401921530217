class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class ValidateBST {

    static boolean validate(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return validate(root.left, min, root.data) &&
               validate(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println(validate(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
