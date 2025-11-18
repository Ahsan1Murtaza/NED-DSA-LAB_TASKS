public class Q4 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(30, 2);
        dll.insertAtPosition(20, 3);

        System.out.println("Original List:");
        dll.displayForward();
        System.out.println("Total Nodes: " + dll.getTotalNodes());


        dll.deleteAtPosition(0); // delete 2nd node
        System.out.println("After 1 deletion, Total Nodes: " + dll.getTotalNodes());

        dll.deleteAllWithValue(20); // delete all nodes with value 20
        System.out.println("After deleting all 20s, Total Nodes: " + dll.getTotalNodes());

        dll.deleteAtPosition(0); // delete first node
        System.out.println("After deleting first node, Total Nodes: " + dll.getTotalNodes());
    }
}
