class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numList.indexOf(complement) != -1) {
                return new int[] {numList.indexOf(complement), i};
            }
            numList.add(nums[i]);
        }
        return null;
    }
}
