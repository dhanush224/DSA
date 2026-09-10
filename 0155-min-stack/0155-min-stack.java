class MinStack {
    private List<Integer> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    int idx=0;
    int index=0;
    private Map<Integer,Integer> map = new HashMap<>();

    public MinStack() {
    }
    
    public void push(int value) {
        map.put(idx,value);
        idx++;
        min=Math.min(min,value);
        list.add(index,min);
        index++;

    }
    
    public void pop() {
        map.remove(idx-1);  
        idx--;    
        index--;
        if(index==0) min = Integer.MAX_VALUE;
        else if(list.get(index)==min){
            min=list.get(index-1);
        }
    }
    
    public int top() {
        return map.get(idx-1);       
    }
    
    public int getMin() {
        return list.get(index-1);
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