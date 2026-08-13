class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<String> charSet = new HashSet<>();

        String[] chars = s.split("");
        int r = 0;
        int l = 0;
        int length = 0;

        while(r < s.length()) {
            String c = chars[r];
            while(l < r && charSet.contains(c)) {
                charSet.remove(chars[l]);
                l++;
            }
            charSet.add(c);
            length = Math.max(length, (r - l)+1);
            r++;
        }
        return length;
    }
}
