class DoublyLinkedList {
    protected Node head;
    protected Node tail;
    protected int size;

    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    // 1. Insert at any position including last
    public void insertAtPosition(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else if (index == 0) { // insert at beginning
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (index == size) { // insert at last position
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else { // insert in middle
            Node curr = head;
            for (int i = 1; i < index; i++) curr = curr.next;
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
        }

        size++;
    }

    // 2. Delete at position including last without deleteAtLast
    public void deleteAtPosition(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) { // delete first node
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null; // list became empty
        } else if (index == size - 1) { // delete last node
            tail = tail.prev;
            tail.next = null;
        } else { // delete in middle
            Node curr = head;
            for (int i = 0; i < index; i++) curr = curr.next;
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }

        size--;
    }

    // 3. Delete all nodes with given value
    public void deleteAllWithValue(int value) {
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            if (curr.data == value) {
                if (curr == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null;
                } else if (curr == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
                size--;
            }
            curr = next;
        }
    }

    // 4. Clear the entire list
    public void clear() {
        head = tail = null;
        size = 0;
    }

    // Count nodes
    public int getTotalNodes() {
        return size;
    }

    // Display list forward
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

// Node class
class Node {
    int data;
    Node next, prev;

    Node(int d) {
        data = d;
        next = prev = null;
    }
}
