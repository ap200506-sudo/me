class MinStack {
    ArrayList<Integer> al;
    int idx;
    int idxmin;
    ArrayList<Integer> min;
    public MinStack() {
        min = new ArrayList<>();
        al= new ArrayList<>();
        idx=-1;
        idxmin=-1;
    }
    
    public void push(int val) {
    al.add(val);
    if(min.isEmpty() || val <= min.get(min.size() - 1)) {
        min.add(val);
    }
        
    }
    
    public void pop() {
        int removed = al.remove(al.size() - 1);
        if (removed == min.get(min.size() - 1)) {
            min.remove(min.size() - 1);
        }

        
    }
    
    public int top() {
        
        return al.get(al.size()-1);
        
    }
    
    public int getMin() {
        
        
        return min.get(min.size()-1);
    
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */