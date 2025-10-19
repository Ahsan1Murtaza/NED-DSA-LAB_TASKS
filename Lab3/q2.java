public class q2 {
    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.insertAtEnd(10);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.println(dll.search(40));

    }
}
