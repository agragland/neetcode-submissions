class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        List<Integer> zeroes = new ArrayList<>();

        int mainProduct = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroes.add(i);
                continue;
            }
            if(mainProduct == 0) 
            {
                mainProduct = nums[i]; 
                continue;
            }
            mainProduct *= nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            if((!zeroes.isEmpty() && !zeroes.contains(i)) || zeroes.size() > 1) {
                ret[i] = 0;
            }
            else if(zeroes.contains(i)) {
                ret[i] = mainProduct;
            }
            else {
                ret[i] = (int)(mainProduct* Math.pow(nums[i], -1));
            }

        }
        return ret;
    }
}  
