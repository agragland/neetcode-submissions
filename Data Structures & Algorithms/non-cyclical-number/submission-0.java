class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)) {
            seen.add(n);
            //calculate the sum of squares
            String num = Integer.toString(n);
            int sum = 0;
            for(int i = 0; i < num.length(); i++) {
                int a = Character.getNumericValue(num.charAt(i));
                sum += Math.pow(a , 2);
            }
            n = sum;
            if(n == 1) {
                return true;
            }
        }
        return false;
    }
}
