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
    public int rob(TreeNode root) {
        int[] ans=rob_(root);
        return Math.max(ans[0],ans[1]);
    }
    
    public int[] rob_(TreeNode root)
    {
        if(root==null)
            return new int[]{0,0};
        
        int[] left=rob_(root.left);
        int[] right=rob_(root.right);
        
        int[] myans=new int[2];
         
        myans[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        myans[1]=left[0]+root.val+right[0];
        return myans;
        
    }
}