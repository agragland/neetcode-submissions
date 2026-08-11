class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(char a : sChar) {
            sCount[a - 'a']++;
        }
        for(char a : tChar) {
            tCount[a - 'a']++;
        }

        return Arrays.compare(sCount,tCount) == 0 ? true : false;
    }
}
