class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int i : nums) {
            numsList.add(i);
        }

        for(int i = 0; i < numsList.size(); i++) {
            int targetSearch = target - (Integer) numsList.get(i);
            int targetIndex = numsList.lastIndexOf(targetSearch);

            if(targetIndex != -1 && targetIndex != i) {
                return new int[] {i, targetIndex};
            }
        }

        return new int[0];
    }
}
