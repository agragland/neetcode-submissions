class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l < r) {
            int m = (l+r)/2;
            if(nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        int pivot = l;

        int s1l = 0, s1r = pivot - 1;
        int s2l = pivot, s2r = nums.length - 1;

        while(s1l <= s1r) {
            int m = (s1l + s1r) / 2;
            if(nums[m] == target) {
                return m;
            }
            if(nums[m] > target) {
                s1r = m-1;
            }
            else {
                s1l = m+1;
            }
        } 

        while(s2l <= s2r) {
            int m = (s2l + s2r) / 2;
            if(nums[m] == target) {
                return m;
            }
            if(nums[m] > target) {
                s2r = m-1;
            }
            else {
                s2l = m+1;
            }
        } 

        return -1;
    }
}
