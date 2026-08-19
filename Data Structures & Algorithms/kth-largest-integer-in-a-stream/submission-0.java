class KthLargest {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int kVal;
    public KthLargest(int k, int[] nums) {
        kVal = k;
        for(int i : nums) {
            heap.add(i);
            if(heap.size() > kVal) {
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size() > kVal) {
            heap.poll();
        }
            return heap.peek();
    }
}
