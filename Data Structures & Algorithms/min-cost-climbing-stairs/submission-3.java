class Solution {
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length];
        Arrays.fill(memo, -1);
        //return the min of starting at 0 and starting at 1
        return Math.min(dfs(0, cost), dfs(1, cost));

        //recursively go through and add the cost of each step
        //to cost i + the Min of i + 1 and i + 2
        //if >= cost.length -> cost = 0;
    }   

    private int dfs(int i, int[] cost) {
        if(i >= cost.length) {
            return 0;
        }
        if(memo[i] != -1) return memo[i];
        return memo[i] = cost[i] + Math.min(dfs(i+1, cost), dfs(i+2, cost));
    }
}
