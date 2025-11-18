public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(30, 2);

        System.out.println("Original List:");
        dll.displayForward();

        dll.clear();

        System.out.println("After Clearing the List:");
        dll.displayForward();
        System.out.println("Total Nodes: " + dll.getTotalNodes());
    }
}
