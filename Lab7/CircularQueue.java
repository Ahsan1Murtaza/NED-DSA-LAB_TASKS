class CircularQueue<T> {

    private Node<T> rear;

    public CircularQueue() {
        this.rear = null;
    }

    public boolean isEmpty() {
        return this.rear == null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);

        if (isEmpty()) {
            this.rear = newNode;
            this.rear.next = this.rear;
            return;
        }

        newNode.next = this.rear.next;
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        Node<T> front = this.rear.next;
        T value = front.value;

        if (front == this.rear) {
            this.rear = null;
        } else {
            this.rear.next = front.next;
        }
        front = null;
        return value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node<T> current = this.rear.next;

        while (current != this.rear) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println(current.value + " ");
    }


}