class DoublyLinkedList {

    class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    private Node head, tail;
    private int size;

    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    // MODIFIED INSERT AT POSITION (No insertAtEnd() )
    public void insertAtPosition(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = tail = newNode;
        }
        // Insert at beginning
        else if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        // Insert at last position (NO insertAtEnd)
        else if (index == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        // Insert in middle
        else {
            Node curr = head;
            for (int i = 1; i < index; i++) curr = curr.next;

            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
        }

        size++;
    }

    //  COUNT TOTAL NODES
    public int countNodes() {
        return size;
    }

    //  REVERSE DLL IN PLACE
    public void reverse() {
        if (head == null || head.next == null) return;

        Node curr = head, temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        // Swap head & tail
        temp = head;
        head = tail;
        tail = temp;
    }

    // Display Forward
    public void displayForward() {
        Node curr = head;
        System.out.print("Start -> ");
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


}
