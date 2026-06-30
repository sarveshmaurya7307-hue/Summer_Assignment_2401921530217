import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class ConstructTree {

    static int preIndex = 0;
    static Map<Integer, Integer> map = new HashMap<>();

    static Node build(int[] preorder, int left, int right) {

        if (left > right)
            return null;

        Node root = new Node(preorder[preIndex++]);

        int index = map.get(root.data);

        root.left = build(preorder, left, index - 1);
        root.right = build(preorder, index + 1, right);

        return root;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        Node root = build(preorder, 0, inorder.length - 1);

        inorder(root);
    }
}
