class q1 {
    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.displayForward();
        dll.displayBackward();

        dll.insertAtPosition(50, 4);
        dll.insertAtPosition(1, 0);
        dll.insertAtPosition(4, 3);
        dll.displayForward();


        dll.deleteAtBeginning();
        dll.displayForward();

        dll.deleteAtLast();
        dll.displayForward();

        dll.deleteAtPosition(0);
        dll.deleteAtPosition(3);
        dll.deleteAtPosition(1);
        dll.displayForward();


    }
}
