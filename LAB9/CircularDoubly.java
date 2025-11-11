class DoublyNode{
    public int data;
    public DoublyNode next;
    public DoublyNode prev;

    public DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class CircularDoubly {
    public DoublyNode head;
    public int size = 0;

    public CircularDoubly() {
        this.head = null;
    }

    public void insertAtBeginning(int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            size++;
            return;
        }

        DoublyNode curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;

        newNode.prev = curr;
        newNode.next = head;

        head.prev = newNode;
        head = newNode;
        size++;
    }

     public void insertAtLast(int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            size++;
            return;
        }

        DoublyNode curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;

        newNode.prev = curr;
        newNode.next = head;

        head.prev = newNode;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        head.prev.prev.next = head;
        head.prev = head.prev.prev;
        
    }

    public void insertAtPosition(int index, int val) {
        DoublyNode newNode = new DoublyNode(val);

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

        DoublyNode curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next.prev = newNode;

        curr.next = newNode;
        newNode.prev = curr;
        size++;
    }



    public void display() {
        DoublyNode curr = head;
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
