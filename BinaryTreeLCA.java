import java.util.*;

public class BinaryTreeLCA {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static TreeNode findLCA(TreeNode root, TreeNode n1, TreeNode n2) {
        if (root == null || root == n1 || root == n2) return root;

        TreeNode leftLCA = findLCA(root.left, n1, n2);
        TreeNode rightLCA = findLCA(root.right, n1, n2);

        return (leftLCA != null && rightLCA != null) ? root : (leftLCA != null ? leftLCA : rightLCA);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode n1 = root.left;  // Node with value 5
        TreeNode n2 = root.left.right.right;  // Node with value 4

        TreeNode lca = findLCA(root, n1, n2);
        System.out.println("Lowest Common Ancestor of " + n1.val + " and " + n2.val + " is: " + lca.val);
    }
}
