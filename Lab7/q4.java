public class q4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

    
        queue.display();
        System.out.println("Total elements: " + queue.totalElements());
    }
}
