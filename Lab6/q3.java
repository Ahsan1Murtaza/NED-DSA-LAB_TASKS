class q3 {
    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue = new CircularQueue<>(5);
        

        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);

        circularQueue.dequeue();
       
        System.out.println("Front element: " + circularQueue.peek());
    }


}