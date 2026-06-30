class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}
public class SearchBST {

    static Node search(Node root, int key) {

        if (root == null || root.data == key)
            return root;
        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }
    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        Node ans = search(root, 2);
        if (ans != null)
            System.out.println("Found: " + ans.data);
        else
            System.out.println("Not Found");
    }
}
