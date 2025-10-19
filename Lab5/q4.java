public class q4 {
    public static void main (String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(15);
        stack1.push(25);

        System.out.println("Stack elements:");
        stack1.display();


        // Reversing stack1
        Stack<Integer> stack2 = new Stack<>();
        while (!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        System.out.println("Reversed stack elements:");

        stack1 = stack2;
        stack1.display();
    }
}
