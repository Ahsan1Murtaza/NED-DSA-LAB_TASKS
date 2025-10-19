public class q4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        
        System.out.println("Empty ? " + queue.isEmpty());
        System.out.println("Full ? " + queue.isFull());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    
        System.out.println("Empty ? " + queue.isEmpty());
        System.out.println("Full ? " + queue.isFull());

    }

}