class Solution {
    public int compress(char[] chars) {
        int k = 0; // write pointer
        int i = 0; // read pointer
        int n = chars.length;
        while(i < n) {
            chars[k++] = chars[i];
            int j = i + 1;
            while(j < n && chars[i] == chars[j]) {
                j++;
            }
            if(j - i > 1) {
                String count = String.valueOf(j - i);
                for(char c: count.toCharArray()) {
                    chars[k++] = c;
                }
            }
            i = j;
        }

        return k;
    }
}