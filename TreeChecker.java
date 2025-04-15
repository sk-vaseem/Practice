class TreeChecker {

    // Node class representing a tree node
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    // Method to check if two trees are identical
    public boolean areIdentical(TreeNode tree1, TreeNode tree2) {
        // If both trees are null, they are identical
        if (tree1 == null && tree2 == null) {
            return true;
        }

        // If one tree is null and the other isn't, they are not identical
        if (tree1 == null || tree2 == null) {
            return false;
        }

        // Check data of current nodes and recurse for left and right subtrees
        return (tree1.data == tree2.data &&
                areIdentical(tree1.left, tree2.left) &&
                areIdentical(tree1.right, tree2.right));
    }

    public static void main(String[] args) {
        TreeChecker treeChecker = new TreeChecker();

        // Create two sample trees
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        if (treeChecker.areIdentical(tree1, tree2)) {
            System.out.println("The trees are identical.");
        } else {
            System.out.println("The trees are not identical.");
        }
    }
}
