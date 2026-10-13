class MinStack {

    final Deque<Integer> stack;
    final Queue<Integer> sortedOrder;

    public MinStack() {
        stack = new ArrayDeque<>();
        sortedOrder = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        sortedOrder.add(val);
    }
    
    public void pop() {
        if (!stack.isEmpty()){
            int val = stack.pop();
            sortedOrder.remove(val);
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
        return sortedOrder.peek();
    }
}
