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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                temp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ans.add(temp);
        }
        int ind = ans.size()-1;
        List<Integer> temp = new ArrayList<>(ans.get(ind));
        int sum=0;
        for(int i=0;i<temp.size();i++){
            sum += temp.get(i);
        }
        return sum;
    }
}