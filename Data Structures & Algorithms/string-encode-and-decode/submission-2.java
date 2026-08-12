class Solution {

    public String encode(List<String> strs) {
        String ret = "";
        for(String str : strs) {
            ret += (str.length()+1) + "#" + str;
        }
        return ret;
    }

    public List<String> decode(String str) {
        List<String> ret = new ArrayList<>();
        int offset = 0;
        while(offset < str.length()) {
            int delim = str.indexOf("#", offset);
            int length = Integer.parseInt(str.substring(offset, delim));
            ret.add(str.substring(delim+1, delim+length));
            offset = (delim+length);
        }

        return ret;
    }
}
