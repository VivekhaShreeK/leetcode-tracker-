// Last updated: 7/9/2026, 9:53:00 AM
class MinStack {
    private int[] stack;       
    private int[] minStack;    
    private int top;           
    private int capacity;     

    public MinStack() {
        capacity = 30000;      
        stack = new int[capacity];
        minStack = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        top++;
        stack[top] = val;
        if (top == 0) {
            minStack[top] = val;
        } else {
            minStack[top] = Math.min(val, minStack[top - 1]);
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
        }
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return minStack[top];
    }
}
