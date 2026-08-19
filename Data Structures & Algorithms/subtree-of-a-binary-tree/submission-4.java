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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }
        if(subRoot == null) return true;

        if(dfs(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        //dfs approach
        //see if node == starting node
        //run nested dfs to check structure and values
        //return true if dfs returns true
    }

    private boolean dfs(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        } 

        if(p != null && q != null && p.val == q.val) {
            return dfs(p.left, q.left) && dfs(p.right, q.right);
        } else {
            return false;
        }
    }
}
