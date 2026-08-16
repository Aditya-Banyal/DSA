class Pair{
    int value;
    int min;
    Pair(int value,int min){
        this.value=value;
        this.min=min;
    }
}
class MinStack {
        Deque<Pair>st=new ArrayDeque<>();
        int min=Integer.MAX_VALUE;
    public MinStack() {
    }
    
    public void push(int value) {
        min=Math.min(value,min);
        st.push(new Pair(value,min));
    }
    
    public void pop() {
        st.pop();
        if(!st.isEmpty())min=st.peek().min;
        else{
            min=Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return st.peek().value;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */