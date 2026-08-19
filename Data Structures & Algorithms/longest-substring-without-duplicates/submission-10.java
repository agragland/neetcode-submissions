class Solution {
    public int lengthOfLongestSubstring(String s) {
        //define a hashSet to store unique characters
        //when we encounter a character we've seen, remove it
        //move the left side of the window over 1
        Set<Character> charSet = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxSubstr = 0;
        while(r < s.length()) {
            while(charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            maxSubstr = Math.max(maxSubstr, r - l + 1);
            r++;
        }
        return maxSubstr;
    }
}
