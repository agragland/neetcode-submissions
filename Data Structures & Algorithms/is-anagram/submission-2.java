class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<String,Integer> charCounts = new HashMap<>();
        String[] sChars = s.split("");
        String[] tChars = t.split("");

        for(int i = 0; i < s.length(); i++) { 
            if(charCounts.get(sChars[i]) == null){
                charCounts.put(sChars[i], 0);
            }  
            if (charCounts.get(tChars[i]) == null) {
               charCounts.put(tChars[i], 0);
            }
            charCounts.put(sChars[i], charCounts.get(sChars[i]) + 1);
            charCounts.put(tChars[i], charCounts.get(tChars[i]) - 1);
        }
        for(int count : charCounts.values()) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
