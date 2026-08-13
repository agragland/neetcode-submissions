class Solution {
    public int maxArea(int[] heights) {
        int length = heights.length;
        int left = 0;
        int right = length - 1;
        int distance = right - left;
        int maxSize = 0;

        while(left < right) { 
            int maxHeight = Math.min(heights[left], heights[right]);
            int newSize = maxHeight * distance;
            maxSize = newSize > maxSize ? newSize : maxSize;
            if(heights[left] < heights[right]) {
                left++;
            }
            else if(heights[right] < heights[left]) {
                right--;
            }
            else {
                left++;
                right--;
            }
            distance = right - left;
        }

        return maxSize;
    }
}
