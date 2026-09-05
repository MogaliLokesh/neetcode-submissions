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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        // return helper(root,0);
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }

    int helper( TreeNode root, int level){
        if(root==null) return level;

        return 1+Math.max(helper(root.left,level), helper(root.right,level));
    }
}
