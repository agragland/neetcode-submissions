class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for(String s : strs) { 
            char[] chars = s.toCharArray();
            int[] freqs = new int[26];
            for(char c : chars) {
                freqs[c - 'a']++;
            }
            String key = Arrays.toString(freqs);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
        }
        return new ArrayList<>(groups.values());

    }
}
