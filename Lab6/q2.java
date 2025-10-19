public class q2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        
        System.out.println("Front element: " + queue.peek());

   
    }

}