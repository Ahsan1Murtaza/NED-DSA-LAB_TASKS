public class q5 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        queue.display();

        queue.clear();

        queue.display();
    }
}
