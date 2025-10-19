public class Queue<T> {
    
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);

        if (isEmpty()) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        T removed = this.front.value;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node<T> current = this.front;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }


    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        return this.front.value;
    }

    public int totalElements() {
        int count = 0;
        Node<T> current = this.front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void clear() {
        this.front = null;
        this.rear = null;
    }
}
