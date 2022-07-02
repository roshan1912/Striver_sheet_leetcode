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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
            return ans;
        q.add(root);
        int flag=0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = q.poll();
                if(curr!=null){
                    res.add(curr.val);
                    q.add(curr.left);
                    q.add(curr.right);
                }
            }
            if(!res.isEmpty()){
                if(flag%2==1)
                    Collections.reverse(res);
                ans.add(res);
            }
            flag++;
        }
        return ans;
    }
}