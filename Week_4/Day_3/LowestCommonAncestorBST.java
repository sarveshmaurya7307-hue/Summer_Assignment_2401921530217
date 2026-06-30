class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class LowestCommonAncestorBST {

    static Node lca(Node root, int p, int q) {

        while (root != null) {

            if (p < root.data && q < root.data)
                root = root.left;

            else if (p > root.data && q > root.data)
                root = root.right;

            else
                return root;
        }

        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);
        Node ans = lca(root, 2, 8);
        System.out.println("LCA: " + ans.data);
    }
}
