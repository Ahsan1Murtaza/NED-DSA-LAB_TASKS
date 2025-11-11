class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularSingly {
    
    Node head;
    int size = 0;

    public void deleteFirst() {
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        head = head.next;
        curr.next = head;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            head.next = head;
            size++;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            head.next = head;
            size++;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        size++;
    }


    public void insertAtPosition(int index, int val) {
        Node newNode = new Node(val);

        if (index <= 0) 
        {
            insertAtBeginning(val);
            return;
        }

        if (index >= size) 
        {
            insertAtLast(val);
            return;
        }

        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public boolean search(int val) {
        Node curr = head;
        if (curr.data == val) return true;
        curr = curr.next;
        while (curr != head) {
            if (curr.data == val) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    public void display() {
        Node curr = head;
        if (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        while (curr != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
