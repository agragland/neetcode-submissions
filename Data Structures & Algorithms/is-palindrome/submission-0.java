class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int midpoint = (c.length()/2);
        System.out.println(midpoint + " " + c);
        for(int i = 0; i < midpoint; i++) {
            if(c.charAt(i) != c.charAt(c.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
