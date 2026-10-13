class MinStack {

    final Deque<Integer> stack;
    final Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()){
            int val = stack.pop();
            if (minStack.peek() == val){
                minStack.pop();
            }
        } else {
            throw new RuntimeException("Empty Stack!");
        }
    }
    
    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        }
        throw new RuntimeException("Empty Stack!");
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
