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
    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }

    int helper(TreeNode root, int maxVal){
        if(root==null) return 0;

        int res = (root.val>=maxVal) ? 1 : 0;
        maxVal=Math.max(maxVal,root.val);
        res += helper(root.left,maxVal);
        res += helper(root.right,maxVal);

        return res;

    }
}
