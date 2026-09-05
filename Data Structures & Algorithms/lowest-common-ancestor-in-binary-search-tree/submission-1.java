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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //left tree, right tree, node is one among p and q;
        // if(root.val>p.val && root.val<q.val) return root;
        TreeNode[] res = new TreeNode[]{root};
        helper(root,p,q,res);
        return res[0];
    }

    void helper(TreeNode root, TreeNode p, TreeNode q, TreeNode[] res){
        if(root==null) return;

        if(p.val==root.val||q.val==root.val){
             res[0]=root; return;
        }
        else if(root.val>p.val&&root.val<q.val || root.val <p.val&&root.val>q.val ){
                         res[0]=root; return;

        }

        else if(p.val>root.val&&q.val>root.val){
            helper(root.right,p,q,res);
        }
        else{
            helper(root.left,p,q,res);
        }
    }
}
