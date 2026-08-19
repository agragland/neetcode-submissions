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
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }

    private int[] dfs(TreeNode root) {
        if(root == null) {
            //1 means it's balanced
            //0 is the height
            return new int[] {1, 0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        if(left[0] == 1 && right[0] == 1) {
            if(Math.abs(left[1] - right[1]) <= 1) {
                return new int[] {1, 1+Math.max(left[1], right[1])};
            }
        }
        return new int[] {0, 1+Math.max(left[1], right[1])};
    }
}
