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
    int sum=0;
public int findTilt(TreeNode root) {
    
        int a=tiltdiff(root);
    return sum;
}

public int tiltdiff(TreeNode root)
{
    if(root==null)
        return 0;
    if(root.left==null && root.right==null)
        return root.val;
    int l=tiltdiff(root.left);
    int r=tiltdiff(root.right);
    sum+=Math.abs(l-r);
    
    return l+r+root.val;
}
}