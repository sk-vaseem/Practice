public class Mainn {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Adding nodes to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the list
        System.out.println("Initial Linked List:");
        list.display();

        // Delete a node
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();
    }
}