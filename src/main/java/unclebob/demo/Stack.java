package unclebob.demo;

public class Stack {
    private int size = 0;
    private int[] elements = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        this.elements[size++] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new UnderFlowException();
        }
        return elements[--size];
    }

    public class UnderFlowException extends RuntimeException {
    }
}
