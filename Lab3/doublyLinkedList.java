class doublyLinkedList{
    protected  Node head;
    protected  Node tail;
    protected  int size;

    public doublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        this.size += 1;
    }


    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        this.size += 1;
    }


    public void insertAtPosition(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        if (index == size) {
            insertAtEnd(data);
            return; 
        }

        Node newNode = new Node(data);
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


    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;

        if (head == null) {
            tail = null;
        }
        else {
            head.prev = null;
        }
        this.size -= 1;
    }

    public void deleteAtLast() {
        if (tail == null) {
            System.out.println("The list is empty");
            return;
        }
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        this.size -= 1;
    }


    public void deleteAtPosition(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            deleteAtBeginning();
            return;
        }
        if (index == size - 1) {
            deleteAtLast();
            return;
        }
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

    public void displayForward() {
        Node current = head;
        System.out.print("Start -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public void displayBackward() {
        Node current = tail;
        System.out.print("Start -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }


    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public int getTotalNodes() {
        return this.size;
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return; // Nothing to reverse
        }

        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (tail != null) {
            head = temp.prev;
        }


        temp = head;
        head = tail;
        tail = temp;
    }


    public void merge(doublyLinkedList other) {
        if (other.head == null) {
            return; // Nothing to merge
        }

        if (this.head == null) {
            this.head = other.head;
            this.tail = other.tail;
            this.size = other.size;
           
        }
        else{
            this.tail.next = other.head;
            other.head.prev = this.tail;
            this.tail = other.tail;
            this.size += other.size;
            
        }

        other.head = null;
        other.tail = null;
        other.size = 0;
    }
}

class Node{
    public  int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}