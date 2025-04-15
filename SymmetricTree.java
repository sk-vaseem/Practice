class SymmetricTree {

    // Node class representing a tree node
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    // Method to check if a tree is symmetric
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // A null tree is symmetric
        }
        // Check if left and right subtrees are mirror images
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode tree1, TreeNode tree2) {
        // If both subtrees are null, they are mirror images
        if (tree1 == null && tree2 == null) {
            return true;
        }

        // If one subtree is null and the other isn't, they are not mirror images
        if (tree1 == null || tree2 == null) {
            return false;
        }

        // Check if the data of current nodes is the same and recurse for children
        return (tree1.data == tree2.data &&
                isMirror(tree1.left, tree2.right) &&
                isMirror(tree1.right, tree2.left));
    }

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();

        // Create a sample symmetric tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        if (symmetricTree.isSymmetric(root)) {
            System.out.println("The tree is symmetric.");
        } else {
            System.out.println("The tree is not symmetric.");
        }
    }
}

