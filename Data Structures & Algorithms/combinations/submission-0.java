class Solution {
    int k;
    int n;
    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        this.n = n;
        int i = 1;
        List<List<Integer>> res = new ArrayList<>();
        dfs(i, new ArrayList(), res);
        return res;
        //include each number
        //exclude a number
        //only keep subsets of size k
        //check recursively by incrementing i
    }

    private void dfs(int i, List<Integer> combo, List<List<Integer>> res) {
        //if i > n and combo.length == k
            //add to res
        if(i > this.n) {
            if(combo.size() == this.k)
                res.add(new ArrayList<>(combo));
            return;
        }
        combo.add(i);
        dfs(i + 1, combo, res);
        combo.remove(combo.size() - 1);
        dfs(i + 1, combo, res);
        //include i
        //recursive i + 1
        //remove i
        //recursive i + 1
    }
}