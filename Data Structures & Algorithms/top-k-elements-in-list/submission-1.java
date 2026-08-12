class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();

        for(int i : nums) {
            freqs.putIfAbsent(i, 0);
            freqs.replace(i, freqs.get(i) + 1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        freqs.forEach((key, v) -> {
            pq.add(new int[] {v, key});

            if(pq.size() > k) {
                pq.poll();
            }
        });

        int[] ret = new int[pq.size()];
        int index = 0;
        while(!pq.isEmpty()) {
            ret[index] = pq.poll()[1];
            index++;
        }

        return ret;
    }
}
