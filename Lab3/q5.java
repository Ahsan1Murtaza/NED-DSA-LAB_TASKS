public class q5 extends doublyLinkedList{
    public q5(){
        super();
    }

    @Override
    public void deleteAtPosition(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        // If Empty List
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete At Beginning
        if (index == 0) {
            if (head == tail) { // Only one node
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            this.size -= 1;
            return;
        }
        // Delete At End
        if (index == size - 1) {
            if (head == tail) { // Only one node
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            this.size -= 1;
            return;
        }

        // Delete At Middle
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next != null) {
            current.next.prev = current;
        }
        this.size -= 1;
    }

    public static void main(String[] args) {
        q5 dll = new q5();
        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(30, 1);
        dll.insertAtPosition(40, 3);
        dll.displayForward();

        dll.deleteAtPosition(0);
        dll.displayForward();
        dll.deleteAtPosition(2);
        dll.displayForward();
    }
}
