class MinStack {

    private final Deque<Integer> stack;
    private final SortedSet<Integer> ordered;

    public MinStack() {
        stack = new ArrayDeque();
        ordered = new TreeSet<>();
    }
    
    public void push(int val) {
        stack.push(val);
        ordered.add(val);
    }
    
    public void pop() {
        if (!stack.isEmpty()){
            int top = stack.pop();
            ordered.remove(top);
        }
    }
    
    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        }
        throw new RuntimeException ("Empty Stack");
    }
    
    public int getMin() {
        if (!ordered.isEmpty()){
            return ordered.first(); 
        }
        throw new RuntimeException ("Empty Stack");
    }
}
