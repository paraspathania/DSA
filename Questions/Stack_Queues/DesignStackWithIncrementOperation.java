package Questions.Stack_Queues;
public class DesignStackWithIncrementOperation {
    private int[] stack;
    private int[] inc;
    private int top;
    public DesignStackWithIncrementOperation(int maxSize) {
        stack = new int[maxSize];
        inc = new int[maxSize];
        top = -1;
    }
    public void push(int x) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = x;
        }
    }
    public int pop() {
        if (top == -1)
            return -1;
        int result = stack[top] + inc[top];
        if (top > 0) {
            inc[top - 1] += inc[top];
        }
        inc[top] = 0;
        top--;
        return result;
    }
    public void increment(int k, int val) {
        if (top >= 0) {
            inc[Math.min(top, k - 1)] += val;
        }
    }
    public static void main(String[] args) {
        System.out.println("Design a Stack With Increment Operation Implemented");
    }
}
