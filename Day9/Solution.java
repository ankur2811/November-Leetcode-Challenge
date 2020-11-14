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
    int ans=-(int)1e9;
    public int maxAncestorDiff(TreeNode root) {
        int min=root.val;
        int max=root.val;
        maxdiff(root,min,max);
        return ans;
    }
    
    public void maxdiff(TreeNode root, int min,int max)
    {
        if(root==null){
          ans=Math.max(ans,max-min);  
            return ;
        }
        min=Math.min(root.val,min);
            max=Math.max(root.val,max);
        maxdiff(root.left,min,max);
        maxdiff(root.right,min,max);
    }
}