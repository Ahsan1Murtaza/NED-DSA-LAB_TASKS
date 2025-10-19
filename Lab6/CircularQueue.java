public class CircularQueue<T> {

    private T[] arr;
    public int front;
    private int rear;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return this.front == -1 && this.rear == -1;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.size == this.front;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
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
            front = (front + 1) % size;
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

}
