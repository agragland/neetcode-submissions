class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> sq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones) {
            sq.add(i);
        }

        while(sq.size() > 1) {
            int heavyX = sq.poll();
            int heavyY = sq.poll();
            int res = heavyX - heavyY;
            if(res > 0) {
                sq.add(res);
            }
        }
        if(sq.size() == 0) {
            return 0;
        }
        return sq.poll();


    }
}
