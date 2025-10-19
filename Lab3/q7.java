public class q7 {
    public static void main(String[] args) {
        doublyLinkedList dll1 = new doublyLinkedList();
        dll1.insertAtEnd(10);
        dll1.insertAtEnd(30);
        dll1.insertAtEnd(40);


        doublyLinkedList dll2 = new doublyLinkedList();
        dll2.insertAtEnd(10);
        dll2.insertAtEnd(30);
        dll2.insertAtEnd(40);

        dll1.merge(dll2);
        dll1.displayForward();
        
    }
}
