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
    TreeNode f=null;
    TreeNode s=null;
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = f.val;
        f.val=s.val;
        s.val=temp;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(f==null && prev.val>root.val)
            f=prev;
        if(f!=null && prev.val>root.val)
            s=root;
        prev=root;
        
        inorder(root.right);
    }
}