/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
        //dfs traversal
        //at each step check if p == q
        //if not equal or one is null and not the other, return false
        //repeat dfs(p.left, q.left) && dfs(q.right, q.right);
    }

    private boolean dfs(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p != null && q == null || q != null && p == null || p.val != q.val) {
            return false;
        }
        return dfs(p.left, q.left) && dfs(p.right, q.right);
    }
}
