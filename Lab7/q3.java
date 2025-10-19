public class q3 {
    public static void main(String[] args) {

        CircularQueue<Integer> queue = new CircularQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();

        queue.display();

    }
}
