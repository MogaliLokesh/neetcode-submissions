class MinStack {

    Stack<Integer> values;
    Stack<Integer> minValues;
    public MinStack() {
        this.values = new Stack<>();
        this.minValues = new Stack<>();
    }
    
    public void push(int val) {
        if(values.size()==0){
            values.push(val);
            minValues.push(val);
        }
        else{
            values.push(val);
            minValues.push(Math.min(minValues.peek(),val));
        }
    }
    
    public void pop() {
        values.pop();
        minValues.pop();
        
    }
    
    public int top() {
        return values.peek();
    }
    
    public int getMin() {
        return minValues.peek();
    }
}
