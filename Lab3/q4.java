public class q4 extends doublyLinkedList{
    public q4(){
        super();
    }
    @Override
    public void insertAtPosition(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        // If Empty List
        if (head == null) {
            head = newNode;
            tail = newNode;
            this.size += 1;
            return;
        }

        // Insert At Beginning
        if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            this.size += 1;
        }
        else if (index == size) { // insert At end
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            this.size += 1;
        }

        else { // insert at middle
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            this.size += 1;
        }

    }

    public static void main(String[] args) {
        q4 dll = new q4();
        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(30, 1);
        dll.insertAtPosition(40, 3);
        dll.displayForward();
    }
}
