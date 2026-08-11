class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        List<int[]> freqs = new ArrayList<>();
        for(String s : strs) {
            String[] chars = s.split("");
            int[] freq = new int[26];
            for(int i = 0; i < s.length(); i++) {
                int index = (int) s.charAt(i) - 97;
                freq[index]++;
            }
            freqs.add(freq);
        }

        for(int[] f : freqs) {
            if(f == null) continue;
            List<String> group = new ArrayList<>();
            for(int[] f2 : freqs) {
                if(Arrays.compare(f, f2) == 0) {
                    group.add(strs[freqs.indexOf(f2)]);
                    freqs.set(freqs.indexOf(f2), null);
                }
            }
            ret.add(group);
        }
        

        
        return ret;
    }
}
