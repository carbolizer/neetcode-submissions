class MinStack {

    Stack<Integer> defStack;
    Stack<Integer> minStack;

    public MinStack() {
        defStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        defStack.push(val);

        if (minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        defStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return defStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
