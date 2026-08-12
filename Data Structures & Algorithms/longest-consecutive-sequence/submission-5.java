class Solution {
    public int longestConsecutive(int[] nums) {
        //convert nums to set to remove dupes
        //insert into priorityqueue based on min-heap
        //poll while not empty, increase count if pulled element is exactly +1 from the last
        //if not reset count
        if(nums.length == 0) {
            return 0;
        }


        Set<Integer> numSet = new HashSet<>();
        for(int n : nums) {
            numSet.add(n);
        }

        //System.out.println(Arrays.toString(numSet.toArray()));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        numSet.forEach(num -> {
            pq.add(num);
        });

        int consequtive = 1;
        int ret = 1;
        int lastVal = pq.poll();
        while(!pq.isEmpty()) {
            int curVal = pq.poll();
            if(curVal - lastVal > 1) {
                consequtive = 0;
            }
            consequtive++;
            lastVal = curVal;
            if(consequtive >= ret) {
                ret = consequtive;
            } 
        }
        return ret;
    }
}
