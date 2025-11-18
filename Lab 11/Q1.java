public class Q1 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(30, 2);
        dll.insertAtPosition(40, 3);

        System.out.println("Original List:");
        dll.displayForward();

        // Delete first, middle, and last nodes
        dll.deleteAtPosition(0);
        dll.deleteAtPosition(1);
        dll.deleteAtPosition(dll.getTotalNodes() - 1);

        System.out.println("After Deletions:");
        dll.displayForward();
        System.out.println("Total Nodes: " + dll.getTotalNodes());
    }
}
