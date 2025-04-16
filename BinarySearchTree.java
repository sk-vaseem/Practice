

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Method to search for a key in the BST
    public boolean search(Node root, int key) {
        if (root == null) {
            return false; // Key not found
        }
        if (root.key == key) {
            return true; // Key found
        }
        if (key < root.key) {
            return search(root.left, key); // Search in the left subtree
        } else {
            return search(root.right, key); // Search in the right subtree
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);

        int key = 40;
        if (tree.search(tree.root, key)) {
            System.out.println("Key " + key + " found in the BST.");
        } else {
            System.out.println("Key " + key + " not found in the BST.");
        }
    }
}
