public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(30, 2);

        // Display before reverse
        System.out.println("Original DLL:");
        dll.displayForward();

        // Reverse the DLL
        dll.reverse();

        // Display after reverse
        System.out.println("Reversed DLL:");
        dll.displayForward();
    }
}
