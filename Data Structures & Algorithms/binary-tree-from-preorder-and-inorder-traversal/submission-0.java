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
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        Map<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<n;i++){
            hash.put(inorder[i],i);
        }
        return helper(preorder ,0 ,n ,inorder ,0 ,n ,hash);
    }

    private TreeNode helper(int[] preorder,int ip,int jp, int[] inorder, int ii,int ji, Map<Integer,Integer> hash){
        if(ip>=jp||ii>=ji) return null;
        // if(ip>)
        //get the root and figureout left and right segments...
        int nodeVal = preorder[ip];
        TreeNode root = new TreeNode(nodeVal);
        //find index of root in inorder
        int index = hash.get(nodeVal);
        int length = index-ii;
        root.left=helper(preorder ,ip+1,ip+1+length ,inorder ,ii ,index ,hash);
        root.right= helper(preorder, ip+1+length, jp ,inorder, index+1, ji, hash);
        return root;
    }
}
