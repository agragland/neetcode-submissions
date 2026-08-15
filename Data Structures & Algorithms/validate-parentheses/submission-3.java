class Solution {
    public boolean isValid(String s) {
        Stack<String> chars = new Stack<>();
        String validPairs = "()[]{}";
        String leftChars = "([{";
        String rightChars = ")]}";
        for(String c : s.split("")) {
            if(leftChars.indexOf(c) != -1) {
                chars.push(c);
            } else if(rightChars.indexOf(c) != -1) {
                if(chars.isEmpty() || validPairs.indexOf(chars.peek() + c) == -1) {
                    return false;
                }
                chars.pop();
            }
        }
        if(!chars.isEmpty()) {
            return false;
        }
        return true;
    }
}
