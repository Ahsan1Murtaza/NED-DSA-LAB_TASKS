public class Q2 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(10, 2);
        dll.insertAtPosition(30, 3);
        dll.insertAtPosition(10, 4);

        System.out.println("Original List:");
        dll.displayForward();

        // Delete all nodes with value 10
        dll.deleteAllWithValue(10);

        System.out.println("After Deleting All 10s:");
        dll.displayForward();
        System.out.println("Total Nodes: " + dll.getTotalNodes());
    }
}
