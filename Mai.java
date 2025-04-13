public class Mai {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Adding nodes at the end
        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(30);

        // Adding a node at the beginning
        list.addToBeginning(5);

        // Display the list in both directions
        list.displayForward();
        list.displayBackward();

        // Delete a node
        list.delete(20);
        System.out.println("After deleting 20:");
        list.displayForward();
        list.displayBackward();
    }
}
