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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        q.add(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> curRes = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode curNode = q.poll();
                curRes.add(curNode.val);
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
            res.add(curRes.get(curRes.size()-1));
        }

        return res;
    }
}
