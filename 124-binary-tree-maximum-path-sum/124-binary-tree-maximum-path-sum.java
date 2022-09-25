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
    int maxsum = Integer.MIN_VALUE;
    public int sum(TreeNode root){
        if(root==null) return 0;
        int leftsum = sum(root.left);//visit eveery node as root node
        int rightsum = sum(root.right);
        leftsum = Math.max(leftsum,0);// in case if the node value is -ve consider it as zero cause it will affect - 
        rightsum = Math.max(rightsum,0);//total sum 
        int currsum = leftsum+rightsum+root.val; // leftsum and right sum for every node
        maxsum = Math.max(maxsum,currsum);// sum change
        return Math.max(leftsum,rightsum)+root.val;// return ans back to previous node 
    }
    public int maxPathSum(TreeNode root) {
        sum(root);
        return maxsum;
    }
}