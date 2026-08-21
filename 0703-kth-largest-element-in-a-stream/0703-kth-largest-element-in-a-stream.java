class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) {
            this.pq.add(nums[i]);
            if(this.pq.size()>this.k) this.pq.remove();
        }
    }
    
    public int add(int val) {
        this.pq.add(val);
        if(this.pq.size()>this.k)this.pq.remove();
        return this.pq.peek();        
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */