class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int l = 0;
        int[] charFreq = new int[26];
        int maxLen = 0;

        for(int r = 0; r < s.length(); r++) {
            charFreq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, charFreq[s.charAt(r) - 'A']);

            if((r - l + 1) - maxFreq > k) {
                charFreq[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, (r - l + 1));
        }

        return maxLen;
    }
}
