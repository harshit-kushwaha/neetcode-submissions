class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token: tokens){
            switch (token){
                case "+": {
                    Integer op2 = stack.pop();
                    Integer op1 = stack.pop();
                    stack.push(op1 + op2);
                    break;
                }
                case "-": {
                    Integer op2 = stack.pop();
                    Integer op1 = stack.pop();
                    stack.push(op1 - op2);
                    break;
                }
                case "*": {
                    Integer op2 = stack.pop();
                    Integer op1 = stack.pop();
                    stack.push(op1 * op2);
                    break;
                }
                case "/": {
                    Integer op2 = stack.pop();
                    Integer op1 = stack.pop();
                    stack.push(op1 / op2);
                    break;
                }
                default: {
                    stack.push(Integer.valueOf(token));
                }
            }
        }

        return stack.pop();
    }
}
