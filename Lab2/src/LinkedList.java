public class LinkedList {

    public Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        this.size++;
    }

    public void deleteAtLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
        }
        else{
            Node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
        this.size--;
    }

    public int getSize() {
        return this.size;
    }

    public boolean search(int val) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == val) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void reverse() {
        Node curr = head;
        Node next = null;
        Node prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void sort() {
        boolean swapped;

        while (true) {
            swapped = false;
            Node curr = head;
            while (curr.next != null) {
                if (curr.value > curr.next.value) {
                    int temp = curr.value;
                    curr.value = curr.next.value;
                    curr.next.value = temp;
                    swapped = true;
                }
                curr = curr.next;
            }

            if (!swapped) {
                return;
            }
        }
    }

    public void print() {
        Node curr = head;

        System.out.print("HEAD -> ");
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

}
