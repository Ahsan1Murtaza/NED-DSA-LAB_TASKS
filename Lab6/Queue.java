class Queue<T> {
    private int size;
    private int front;
    private int rear;

    private T arr[];

    public Queue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = (T[]) new Object[this.size];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        arr[++rear] = data;

    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        T removed = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        return removed;
    }


    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}