public class q2 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enqueue("Apple");
        queue.enqueue("Banana");
        queue.enqueue("Cherry");

        queue.display();

        System.out.println("Peek: " + queue.peek());
    }
}
