class MedianFinder {

    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        maxHeap.add(-1*num);
        if(maxHeap.size()-minHeap.size()>1){
            minHeap.add(-1*maxHeap.remove());
        } 
        if(!minHeap.isEmpty() && -1*maxHeap.peek()>minHeap.peek()){
            minHeap.add(-1*maxHeap.remove());
            maxHeap.add(-1*minHeap.remove());
        }       
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()){
            return (double)(-1*maxHeap.peek());
        }else{
            double ret = -1*maxHeap.peek() + minHeap.peek();
            return ret/2;
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */