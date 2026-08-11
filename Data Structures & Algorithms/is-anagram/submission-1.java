class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        String[] sChars = s.split("");
        String[] tChars = t.split("");

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for(int i = 0; i < sChars.length; i++) {
            System.out.println(sChars[i] + " " + tChars[i]);
            if(!sChars[i].equals(tChars[i])) {
                return false;
            }
        }

        return true;
    }
}
