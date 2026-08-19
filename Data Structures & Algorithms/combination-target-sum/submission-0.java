class Solution {
    List<List<Integer>> groups;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        groups = new ArrayList<List<Integer>>();
        //dfs from i = 0, target
        List<Integer> group = new ArrayList();
        dfs(0, nums, target, group);
        return groups;
    }

    private void dfs(int i, int[] nums, int target, List<Integer> group)     
    {
        //if target == 0
            //add group to groups;
        //decision tree
        //add nums[i] to group, repeat dfs target - nums[i]
        //remove nums[i] from group, repeat dfs with i+1
        if(target == 0) {
            groups.add(new ArrayList(group));
            return;
        }
        if(target < 0 || i >= nums.length) {
            return;
        }
        group.add(nums[i]);
        dfs(i, nums, target - nums[i], group);
        group.remove(group.size() - 1);
        dfs(i + 1, nums, target, group);
    }
}
