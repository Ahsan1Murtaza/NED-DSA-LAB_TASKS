class Stack<T> {
    private int size;
    private int top;
    private T[] array;

    public Stack() {
        this.size = 10;
        this.array = (T[]) new Object[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top <= -1;
    }

    public boolean isFull() {
        return this.top >= this.size - 1;
    }

    public void push(T val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        array[++top] = val;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return array[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return array[top];
        }
        return null;
    }

}