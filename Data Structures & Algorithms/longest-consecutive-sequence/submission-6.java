class Solution {
    public int longestConsecutive(int[] nums) {
        //convert to a set to remove dupes
        //define ret value = 0
        //iterate over the set
        //if num - 1 is not in the set
        //loop through set with cur_num = 0 where cur_num is in Set
        //increment cur_length by 1
        //increment cur_num by 1

        //after loop, set res to the Max between res, and cur_length
        Set<Integer> numSet = new HashSet<>();
        for(int n : nums) {
            numSet.add(n);
        }
        int ret = 0;

        for(Integer num : numSet) {
             if(!numSet.contains(num - 1)) {
                int currentLen = 0;
                int currentNum = num;
                while(numSet.contains(currentNum)) {
                    currentLen++;
                    currentNum++;
                }
                ret = Math.max(ret, currentLen);
            }
        }

        return ret;
    }
}
